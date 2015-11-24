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

import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonWriter extends CodeWriter {

  public CeylonWriter(CeylonCodeBuilder builder) {
    super(builder);
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

  @Override
  public void renderLambda(LambdaExpressionTree.BodyKind bodyKind, List<TypeInfo> parameterTypes, List<String> parameterNames, CodeModel body) {
    append("(");
    for (int i = 0; i < parameterNames.size(); i++) {
      if (i > 0) {
        append(", ");
      }
      TypeInfo parameterType = parameterTypes.get(i);
      if (parameterType.getKind() == ClassKind.ASYNC_RESULT) {
        TypeInfo resultType = ((ParameterizedTypeInfo) parameterType).getArg(0);
        if (resultType.getKind() == ClassKind.VOID) {
          append("Throwable?");
        } else {
          append(resultType.getSimpleName()).append("|Throwable");
        }
      } else {
        append(parameterType.getSimpleName());
      }
      append(" ").append(parameterNames.get(i));
    }
    append(") => {\n");
    indent();
    body.render(this);
    if (bodyKind == LambdaExpressionTree.BodyKind.EXPRESSION) {
      append("\n");
    }
    unindent();
    append("}");
  }

  @Override
  public void renderEnumConstant(EnumTypeInfo type, String constant) {
    if (Character.isUpperCase(constant.charAt(0))) {
      append("\\i");
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
      ApiTypeModel abc = (ApiTypeModel) expression;
      expression = new ApiTypeModel(builder, abc.getType()) {
        @Override
        public void render(CodeWriter writer) {
          String obj = Case.CAMEL.to(Case.LOWER_CAMEL, abc.getType().getSimpleName());
          writer.append(obj);
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
