// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotIfElse extends PsiElement {

  @NotNull
  DjvSlotElse getSlotElse();

  @NotNull
  List<DjvSlotExpression> getSlotExpressionList();

  @NotNull
  List<DjvSlotForStatement> getSlotForStatementList();

  @NotNull
  List<DjvSlotIfStatement> getSlotIfStatementList();

  @NotNull
  List<DjvTextStatement> getTextStatementList();

}
