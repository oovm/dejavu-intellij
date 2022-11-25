// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotIf extends PsiElement {

  @NotNull
  List<DjvSlotExpression> getSlotExpressionList();

  @NotNull
  List<DjvSlotFor> getSlotForList();

  @NotNull
  List<DjvSlotIf> getSlotIfList();

  @Nullable
  DjvSlotIfElse getSlotIfElse();

  @Nullable
  DjvSlotIfEnd getSlotIfEnd();

  @NotNull
  DjvSlotIfStart getSlotIfStart();

  @NotNull
  List<DjvTextStatement> getTextStatementList();

}
