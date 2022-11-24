// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvExpr extends PsiElement {

  @NotNull
  List<DjvInfix> getInfixList();

  @NotNull
  List<DjvTerm> getTermList();

}
