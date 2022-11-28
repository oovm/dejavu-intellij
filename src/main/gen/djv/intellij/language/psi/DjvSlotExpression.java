// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotExpression extends PsiElement {

  @Nullable
  DjvExpr getExpr();

  @Nullable
  DjvInlineForStatement getInlineForStatement();

  @Nullable
  DjvInlineIfStatement getInlineIfStatement();

  @NotNull
  List<DjvInlineLetStatement> getInlineLetStatementList();

  @NotNull
  DjvSlotL getSlotL();

  @NotNull
  DjvSlotR getSlotR();

}
