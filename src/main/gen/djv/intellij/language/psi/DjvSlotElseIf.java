// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotElseIf extends PsiElement {

  @NotNull
  DjvSlotElseIfStart getSlotElseIfStart();

  @NotNull
  List<DjvSlotExpression> getSlotExpressionList();

  @NotNull
  List<DjvSlotForStatement> getSlotForStatementList();

  @NotNull
  List<DjvSlotIfStatement> getSlotIfStatementList();

  @NotNull
  List<DjvTextStatement> getTextStatementList();

}
