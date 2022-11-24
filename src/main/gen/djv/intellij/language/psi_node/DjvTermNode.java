// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static djv.intellij.language.psi.DjvTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import djv.intellij.language.psi.*;

public class DjvTermNode extends ASTWrapperPsiElement implements DjvTerm {

  public DjvTermNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjvAtom getAtom() {
    return findNotNullChildByClass(DjvAtom.class);
  }

  @Override
  @NotNull
  public List<DjvPrefix> getPrefixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvPrefix.class);
  }

  @Override
  @NotNull
  public List<DjvSuffix> getSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvSuffix.class);
  }

}
