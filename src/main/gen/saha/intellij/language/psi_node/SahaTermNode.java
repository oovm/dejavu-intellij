// This is a generated file. Not intended for manual editing.
package saha.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static saha.intellij.language.psi.SahaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import saha.intellij.language.psi.*;

public class SahaTermNode extends ASTWrapperPsiElement implements SahaTerm {

  public SahaTermNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SahaAtom getAtom() {
    return findNotNullChildByClass(SahaAtom.class);
  }

  @Override
  @NotNull
  public List<SahaPrefix> getPrefixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SahaPrefix.class);
  }

  @Override
  @NotNull
  public List<SahaSuffix> getSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SahaSuffix.class);
  }

}
