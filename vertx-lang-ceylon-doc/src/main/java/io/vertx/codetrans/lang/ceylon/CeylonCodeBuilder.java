package io.vertx.codetrans.lang.ceylon;

import com.sun.source.tree.LambdaExpressionTree;
import io.vertx.codegen.Case;
import io.vertx.codegen.type.ApiTypeInfo;
import io.vertx.codegen.type.EnumTypeInfo;
import io.vertx.codegen.type.ParameterizedTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.CodeModel;
import io.vertx.codetrans.MethodSignature;
import io.vertx.codetrans.RenderMode;
import io.vertx.codetrans.RunnableCompilationUnit;
import io.vertx.codetrans.TypeArg;
import io.vertx.codetrans.expression.ApiTypeModel;
import io.vertx.codetrans.expression.EnumExpressionModel;
import io.vertx.codetrans.expression.EnumFieldExpressionModel;
import io.vertx.codetrans.expression.ExpressionModel;
import io.vertx.codetrans.expression.LambdaExpressionModel;
import io.vertx.codetrans.expression.StringLiteralModel;
import io.vertx.codetrans.expression.VariableScope;
import io.vertx.codetrans.statement.StatementModel;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonCodeBuilder implements CodeBuilder {

  Set<String> variables = new HashSet<>();
  Map<EnumTypeInfo, Set<String>> enumTypes = new LinkedHashMap<>();
  Set<ApiTypeInfo> functionTypes = new LinkedHashSet<>();

  @Override
  public CeylonWriter newWriter() {
    return new CeylonWriter(this);
  }

  @Override
  public String render(RunnableCompilationUnit unit, RenderMode renderMode) {
    CeylonWriter writer = newWriter();

    class CeylonImports {
      Map<String, Collection<String>> entries = new HashMap<>();
      void add(String pkg, String name) {
        add(pkg, Collections.singletonList(name));
      }
      void add(String pkg, List<String> names) {
        entries.computeIfAbsent(pkg, toto -> new LinkedHashSet<>()).addAll(names);
      }
      void print(CeylonWriter writer) {
        entries.forEach((fqn, names) -> {
          writer.append("import ").append(fqn).append(" { ");
          Iterator<String> i = names.iterator();
          while (i.hasNext()) {
            String name = i.next();
            writer.append(name);
            if (i.hasNext()) {
              writer.append(", ");
            }
          }
          writer.append(" } \n");
        });
        if (entries.size() > 0) {
          writer.append("\n");
          writer.append("...\n");
          writer.append("\n");
        }
      }
    }
    CeylonImports ceylonImports = new CeylonImports();

    //
    for (ApiTypeInfo functionType : functionTypes) {
      String pkg;
      String fqn = functionType.translateName("ceylon");
      int index = fqn.lastIndexOf('.');
      pkg = fqn.substring(0, index);
      String simpleName = Case.CAMEL.to(Case.LOWER_CAMEL, fqn.substring(index + 1));
      if (variables.contains(simpleName)) {
        ceylonImports.add(pkg, simpleName + "_ = " + simpleName);
      } else {
        ceylonImports.add(pkg, simpleName);
      }
    }

    //
    enumTypes.forEach((enumType, values) -> {
      String pkg;
      String fqn = enumType.translateName("ceylon");
      int index = fqn.lastIndexOf('.');
      pkg = fqn.substring(0, index);
      ceylonImports.add(pkg, values.stream().map(String::toLowerCase).collect(Collectors.toList()));
    });

    //
    ceylonImports.print(writer);

    unit.getMain().render(writer);
    return writer.getBuffer().toString();
  }

  public ExpressionModel toDataObjectValue(EnumFieldExpressionModel enumField) {
    return new StringLiteralModel(this, enumField.identifier);
  }

  @Override
  public ExpressionModel asyncResultHandler(LambdaExpressionTree.BodyKind bodyKind, ParameterizedTypeInfo resultType, String resultName, CodeModel body, CodeModel succeededBody, CodeModel failedBody) {
    return new LambdaExpressionModel(this, bodyKind, Collections.singletonList(resultType), Collections.singletonList(resultName), body);
  }

  @Override
  public StatementModel variableDecl(VariableScope scope, TypeInfo type, String name, ExpressionModel initializer) {
    variables.add(name);
    return StatementModel.render(renderer -> {
      renderer.append("value ").append(name);
      if (initializer != null) {
        renderer.append(" = ");
        initializer.render(renderer);
      }
    });
  }

  @Override
  public StatementModel sequenceForLoop(String variableName, ExpressionModel fromValue, ExpressionModel toValue, StatementModel body) {
    return StatementModel.render(renderer -> {
      renderer.append("for (").append(variableName).append(" in ");
      fromValue.render(renderer);
      renderer.append(":");
      toValue.render(renderer);
      renderer.append(") {\n");
      renderer.indent();
      body.render(renderer);
      renderer.unindent();
      renderer.append("}");
    });
  }

  @Override
  public StatementModel enhancedForLoop(String variableName, ExpressionModel expression, StatementModel body) {
    return StatementModel.render(renderer -> {
      renderer.append("for (").append(variableName).append(" in ");
      expression.render(renderer);
      renderer.append(") {\n");
      renderer.indent();
      body.render(renderer);
      renderer.unindent();
      renderer.append("}");
    });
  }

  @Override
  public StatementModel forLoop(StatementModel initializer, ExpressionModel condition, ExpressionModel update, StatementModel body) {
    return StatementModel.render(renderer -> {
      renderer.append("variable ");
      initializer.render(renderer);
      renderer.append(";\n");
      renderer.append("while (");
      condition.render(renderer);
      renderer.append(") {\n");
      renderer.indent();
      body.render(renderer);
      update.render(renderer);
      renderer.unindent();
      renderer.append("}");
    });
  }

  @Override
  public EnumExpressionModel enumType(EnumTypeInfo type) {
    return new EnumExpressionModel(this, type) {
      @Override
      public ExpressionModel onField(String identifier) {
        enumTypes.computeIfAbsent(type, a -> new LinkedHashSet<>()).add(identifier);
        return super.onField(identifier);
      }
    };
  }

  @Override
  public ApiTypeModel apiType(ApiTypeInfo type) {
    functionTypes.add(type);
    return new ApiTypeModel(this, type) {
      @Override
      public ExpressionModel onMethodInvocation(TypeInfo receiverType, MethodSignature method, TypeInfo returnType, List<TypeArg> typeArguments, List<ExpressionModel> argumentModels, List<TypeInfo> argumentTypes) {
        return super.onMethodInvocation(receiverType, method, returnType, typeArguments, argumentModels, argumentTypes);
      }
    };
  }
}
