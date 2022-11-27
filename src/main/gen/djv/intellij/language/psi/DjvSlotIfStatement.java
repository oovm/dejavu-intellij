// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotIfStatement extends PsiElement {

  @NotNull
  List<DjvSlotElseIf> getSlotElseIfList();

  @NotNull
  List<DjvSlotExpression> getSlotExpressionList();

  @NotNull
  List<DjvSlotForStatement> getSlotForStatementList();

  @Nullable
  DjvSlotIfElse getSlotIfElse();

  @Nullable
  DjvSlotIfEnd getSlotIfEnd();

  @NotNull
  DjvSlotIfStart getSlotIfStart();

  @NotNull
  List<DjvSlotIfStatement> getSlotIfStatementList();

  @NotNull
  List<DjvTextStatement> getTextStatementList();

}
