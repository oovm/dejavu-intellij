// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotFor extends PsiElement {

  @NotNull
  List<DjvSlotExpression> getSlotExpressionList();

  @NotNull
  List<DjvSlotFor> getSlotForList();

  @Nullable
  DjvSlotForElse getSlotForElse();

  @Nullable
  DjvSlotForEnd getSlotForEnd();

  @NotNull
  DjvSlotForStart getSlotForStart();

  @NotNull
  List<DjvTextStatement> getTextStatementList();

}
