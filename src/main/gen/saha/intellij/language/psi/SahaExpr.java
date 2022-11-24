// This is a generated file. Not intended for manual editing.
package saha.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SahaExpr extends PsiElement {

  @NotNull
  List<SahaInfix> getInfixList();

  @NotNull
  List<SahaTerm> getTermList();

}
