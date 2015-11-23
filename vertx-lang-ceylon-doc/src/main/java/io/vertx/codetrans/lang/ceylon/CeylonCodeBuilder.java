package io.vertx.codetrans.lang.ceylon;

import com.sun.source.tree.LambdaExpressionTree;
import io.vertx.codegen.type.ApiTypeInfo;
import io.vertx.codegen.type.ParameterizedTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.CodeModel;
import io.vertx.codetrans.MethodSignature;
import io.vertx.codetrans.RunnableCompilationUnit;
import io.vertx.codetrans.expression.ApiTypeModel;
import io.vertx.codetrans.expression.ExpressionModel;
import io.vertx.codetrans.expression.LambdaExpressionModel;
import io.vertx.codetrans.expression.VariableScope;
import io.vertx.codetrans.statement.StatementModel;

import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonCodeBuilder implements CodeBuilder {

  @Override
  public CeylonWriter newWriter() {
    return new CeylonWriter(this);
  }

  @Override
  public String render(RunnableCompilationUnit unit) {
    CeylonWriter writer = newWriter();
    unit.getMain().render(writer);
    return writer.getBuffer().toString();
  }

  @Override
  public ExpressionModel asyncResultHandler(LambdaExpressionTree.BodyKind bodyKind, ParameterizedTypeInfo resultType, String resultName, CodeModel body) {
    return new LambdaExpressionModel(this, bodyKind, Collections.singletonList(resultType), Collections.singletonList(resultName), body);
  }

  @Override
  public StatementModel variableDecl(VariableScope scope, TypeInfo type, String name, ExpressionModel initializer) {
    return StatementModel.render(renderer -> {
      renderer.append("value ").append(name);
      if (initializer != null) {
        renderer.append(" = ");
        initializer.render(renderer);
      }
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
  public ApiTypeModel apiType(ApiTypeInfo type) {
    return new ApiTypeModel(this, type) {
      @Override
      public ExpressionModel onMethodInvocation(TypeInfo receiverType, MethodSignature method, TypeInfo returnType, List<ExpressionModel> argumentModels, List<TypeInfo> argumenTypes) {
        return super.onMethodInvocation(receiverType, method, returnType, argumentModels, argumenTypes);
      }
    };
  }
}
