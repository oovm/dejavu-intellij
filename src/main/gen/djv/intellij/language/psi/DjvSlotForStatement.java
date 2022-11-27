// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotForStatement extends PsiElement {

  @NotNull
  List<DjvSlotExpression> getSlotExpressionList();

  @Nullable
  DjvSlotForElse getSlotForElse();

  @Nullable
  DjvSlotForEnd getSlotForEnd();

  @NotNull
  DjvSlotForStart getSlotForStart();

  @NotNull
  List<DjvSlotForStatement> getSlotForStatementList();

  @NotNull
  List<DjvSlotIfStatement> getSlotIfStatementList();

  @NotNull
  List<DjvTextStatement> getTextStatementList();

}
