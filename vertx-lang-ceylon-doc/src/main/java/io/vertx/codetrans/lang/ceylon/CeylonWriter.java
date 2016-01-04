package io.vertx.codetrans.lang.ceylon;

import com.sun.source.tree.LambdaExpressionTree;
import io.vertx.codegen.Case;
import io.vertx.codegen.type.ApiTypeInfo;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.type.EnumTypeInfo;
import io.vertx.codegen.type.ParameterizedTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codetrans.CodeModel;
import io.vertx.codetrans.CodeWriter;
import io.vertx.codetrans.MethodSignature;
import io.vertx.codetrans.expression.ApiTypeModel;
import io.vertx.codetrans.expression.DataObjectLiteralModel;
import io.vertx.codetrans.expression.ExpressionModel;
import io.vertx.codetrans.expression.JsonArrayLiteralModel;
import io.vertx.codetrans.expression.JsonObjectLiteralModel;
import io.vertx.codetrans.expression.Member;
import io.vertx.codetrans.statement.StatementModel;
import io.vertx.codetrans.statement.TryCatchModel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonWriter extends CodeWriter {

  private static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(
      "abstracts",
      "alias",
      "assembly",
      "assert",
      "assign",
      "break",
      "case",
      "catch",
      "class",
      "continue",
      "dynamic",
      "else",
      "exists",
      "extends",
      "finally",
      "for",
      "function",
      "given",
      "if",
      "import",
      "in",
      "interface",
      "is",
      "let",
      "module",
      "new",
      "nonempty",
      "object",
      "of",
      "out",
      "outer",
      "package",
      "return",
      "satisfies",
      "super",
      "switch",
      "then",
      "this",
      "throw",
      "try",
      "value",
      "void",
      "void",
      "while"
  ));

  private CeylonCodeBuilder builder;

  public CeylonWriter(CeylonCodeBuilder builder) {
    super(builder);
    this.builder = builder;
  }

  @Override
  public void renderStringLiteral(List<?> parts) {
    append('"');
    for (Object part : parts) {
      if (part instanceof ExpressionModel) {
        append("``");
        ExpressionModel ex = (ExpressionModel) part;
        ex.render(this);
        append("``");
      } else {
        renderChars(part.toString());
      }
    }
    append('"');
  }

  @Override
  public void renderStatement(StatementModel statement) {
    statement.render(this);
    if (!(statement instanceof TryCatchModel)) {
      append(";\n");
    }
  }

  @Override
  public void renderTryCatch(StatementModel tryBlock, StatementModel catchBlock) {
    append("try {\n");
    indent();
    tryBlock.render(this);
    unindent();
    append("} catch(Exception e) {\n");
    indent();
    catchBlock.render(this);
    unindent();
    append("}\n");
  }

  @Override
  public void renderMethodReference(ExpressionModel expression, String methodName) {
    expression.render(this);
    append(".").append(methodName);
  }

  @Override
  public void renderNew(ExpressionModel expression, TypeInfo type, List<ExpressionModel> argumentModels) {
    expression.render(this);
    append('(');
    for (int i = 0; i < argumentModels.size(); i++) {
      if (i > 0) {
        append(", ");
      }
      argumentModels.get(i).render(this);
    }
    append(')');
  }

  @Override
  public void renderListAdd(ExpressionModel list, ExpressionModel value) {
    append("renderListAdd");
  }

  @Override
  public void renderListSize(ExpressionModel list) {
    append("renderListSize");
  }

  @Override
  public void renderListGet(ExpressionModel list, ExpressionModel index) {
    append("renderListGet");
  }

  @Override
  public void renderListLiteral(List<ExpressionModel> arguments) {
    append("ArrayList {");
    Iterator<ExpressionModel> it = arguments.iterator();
    while (it.hasNext()) {
      append(" ");
      it.next().render(this);
      if (it.hasNext()) {
        append(", ");
      }
    }
    append(" }");
  }

  @Override
  public void renderMapGet(ExpressionModel map, ExpressionModel key) {
    append("renderMapGet");
  }

  @Override
  public void renderMapPut(ExpressionModel map, ExpressionModel key, ExpressionModel value) {
    append("renderMapPut");
  }

  @Override
  public void renderMapForEach(ExpressionModel map, String keyName, TypeInfo keyType, String valueName, TypeInfo valueType, LambdaExpressionTree.BodyKind bodyKind, CodeModel block) {
    append("renderMapForEach");
  }

  @Override
  public void renderJsonObject(JsonObjectLiteralModel model) {
    Iterator<Member> it = model.getMembers().iterator();
    if (it.hasNext()) {
      append("JsonObject {\n");
      indent();
      for (Member member : model.getMembers()) {
        append(member.getName()).append(" = ");
        if (member instanceof Member.Single) {
          Member.Single singleMember = (Member.Single) member;
          singleMember.getValue().render(this);
        } else {
          Member.Array arrayMember = (Member.Array) member;
          renderArrayMembers(arrayMember.getValues());
        }
        append(";\n");
      }
      unindent();
      append("}");
    } else {
      append("JsonObject()");
    }
  }

  @Override
  public void renderJsonArray(JsonArrayLiteralModel jsonArray) {
    renderArrayMembers(jsonArray.getValues());
  }

  private void renderArrayMembers(List<ExpressionModel> members) {
    append("JsonArray {");
    Iterator<ExpressionModel> values = members.iterator();
    while (values.hasNext()) {
      values.next().render(this);
      if (values.hasNext()) {
        append(" , ");
      }
    }
    append(" }");
  }

  @Override
  public void renderDataObject(DataObjectLiteralModel model) {
    Iterator<Member> it = model.getMembers().iterator();
    if (it.hasNext()) {
      append(model.getType().getSimpleName()).append(" {\n");
      indent();
      for (Member member : model.getMembers()) {
        append(member.getName()).append(" = ");
        if (member instanceof Member.Single) {
          Member.Single singleMember = (Member.Single) member;
          singleMember.getValue().render(this);
        } else {
          Member.Array arrayMember = (Member.Array) member;
          append("{");
          Iterator<ExpressionModel> values = arrayMember.getValues().iterator();
          while (values.hasNext()) {
            values.next().render(this);
            if (values.hasNext()) {
              append(" , ");
            }
          }
          append(" }");
        }
        append(";\n");
      }
      unindent();
      append("}");
    } else {
      append(model.getType().getSimpleName()).append("()");
    }
  }

  @Override
  public void renderJsonObjectAssign(ExpressionModel expression, String name, ExpressionModel value) {
    expression.render(this);
    append(".put(\"").append(name).append("\", ");
    value.render(this);
    append(")");
  }

  @Override
  public void renderDataObjectAssign(ExpressionModel expression, String name, ExpressionModel value) {
    expression.render(this);
    append(".");
    append(name);
    append(" = ");
    value.render(this);
  }

  @Override
  public void renderJsonObjectToString(ExpressionModel expression) {
    append("renderJsonObjectToString");
  }

  @Override
  public void renderJsonArrayToString(ExpressionModel expression) {
    append("renderJsonArrayToString");
  }

  @Override
  public void renderJsonObjectMemberSelect(ExpressionModel expression, String name) {
    expression.render(this);
    append("get(\"").append(name).append("\"");
  }

  @Override
  public void renderDataObjectMemberSelect(ExpressionModel expression, String name) {
    expression.render(this);
    append(".").append(name);
  }

  @Override
  public void renderNewMap() {
    append("renderNewMap");
  }

  @Override
  public void renderNewList() {
    append("renderNewList");
  }

  @Override
  public void renderAsyncResultSucceeded(TypeInfo resultType, String name) {
    if (resultType.getKind() == ClassKind.VOID) {
      append("!exists ").append(name);
    } else {
      append("is ").append(resultType.getSimpleName()).append(" ").append(name);
    }
  }

  @Override
  public void renderAsyncResultFailed(TypeInfo resultType, String name) {
    append("is Throwable ").append("name");
  }

  @Override
  public void renderAsyncResultCause(TypeInfo resultType, String name) {
    append(name);
  }

  @Override
  public void renderAsyncResultValue(TypeInfo resultType, String name) {
    append(name);
  }

  /**
   * Render the appropriate type declaration in Ceylon.
   *
   * @param type the type info
   * @return the rendered type
   */
  private String renderTypeDeclaration(TypeInfo type) {
    switch (type.getKind()) {
      case VOID:
        return null;
      case ASYNC_RESULT:
        TypeInfo resultType = ((ParameterizedTypeInfo) type).getArg(0);
        if (resultType.getKind() == ClassKind.VOID) {
          return "Throwable?";
        } else {
          return renderTypeDeclaration(resultType) + "|Throwable";
        }
      case API:
      case DATA_OBJECT:
      case THROWABLE:
      case OBJECT:
        return type.getSimpleName();
      case STRING:
        return "String";
      case JSON_OBJECT:
        return "JsonObject";
      case JSON_ARRAY:
        return "JsonArray";
      case PRIMITIVE:
      case BOXED_PRIMITIVE:
        switch (type.getSimpleName()) {
          case "Boolean":
          case "boolean":
            return "Boolean";
          case "Long":
          case "long":
          case "Integer":
          case "int":
            return "Integer";
          case "Float":
          case "float":
          case "Double":
          case "double":
            return "Float";
          default:
            return "TODO: " + type.getName();
        }
      case LIST:
        return "List<" + renderTypeDeclaration(((ParameterizedTypeInfo)type).getArg(0)) + ">";
      default:
        return "TODO: " + type.getName() + " " + type.getKind();
    }
  }

  @Override
  public void renderLambda(LambdaExpressionTree.BodyKind bodyKind, List<TypeInfo> parameterTypes, List<String> parameterNames, CodeModel body) {
    append("(");
    for (int i = 0; i < parameterNames.size(); i++) {
      String decl = renderTypeDeclaration(parameterTypes.get(i));
      if (decl == null) {
        continue;
      }
      if (i > 0) {
        append(", ");
      }
      append(decl);
      append(" ").append(parameterNames.get(i));
    }
    append(") ");
    if (bodyKind == LambdaExpressionTree.BodyKind.EXPRESSION) {
      append("=> ");
    } else {
      append("{\n");
    }
    indent();
    body.render(this);
    unindent();
    if (bodyKind == LambdaExpressionTree.BodyKind.STATEMENT) {
      append("}");
    }
  }

  @Override
  public void renderEnumConstant(EnumTypeInfo type, String constant) {
    constant = constant.toLowerCase();
    if (KEYWORDS.contains(constant)) {
      constant = "\\i" + constant;
    }
    append(constant);
  }

  @Override
  public void renderSystemOutPrintln(ExpressionModel expression) {
    append("print(");
    expression.render(this);
    append(")");
  }

  @Override
  public void renderMethodInvocation(ExpressionModel expression, TypeInfo receiverType, MethodSignature method, TypeInfo returnType, List<ExpressionModel> argumentModels, List<TypeInfo> argumentTypes) {
    if (expression instanceof ApiTypeModel) {
      ApiTypeModel apiTypeModel = (ApiTypeModel) expression;
      expression = new ApiTypeModel(builder, apiTypeModel.getType()) {
        @Override
        public void render(CodeWriter writer) {
          String name = Case.CAMEL.to(Case.LOWER_CAMEL, apiTypeModel.getType().getSimpleName());
          CeylonCodeBuilder builder = (CeylonCodeBuilder) writer.getBuilder();
          if (builder.variables.contains(name)) {
            name += "_";
          }
          writer.append(name);
        }
      };
    }
    super.renderMethodInvocation(expression, receiverType, method, returnType, argumentModels, argumentTypes);
  }

  @Override
  public void renderSystemErrPrintln(ExpressionModel expression) {
    renderSystemOutPrintln(expression);
  }

  @Override
  public void renderThrow(String throwableType, ExpressionModel reason) {
    append("throw Exception(");
    reason.render(this);
    append(")");
  }

  @Override
  public void renderThis() {
    append("this");
  }

  @Override
  public void renderApiType(ApiTypeInfo apiType) {
    append(apiType.getSimpleName());
  }

  @Override
  public void renderJavaType(ClassTypeInfo apiType) {
    append(apiType.getSimpleName());
  }
}
