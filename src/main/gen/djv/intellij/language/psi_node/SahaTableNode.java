// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi_node;

import java.util.List;

import djv.intellij.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static djv.intellij.language.psi.SahaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import saha.intellij.language.psi.*;

public class SahaTableNode extends ASTWrapperPsiElement implements SahaTable {

  public SahaTableNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitTable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SahaPair> getPairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SahaPair.class);
  }

  @Override
  @Nullable
  public SahaTypeHint getTypeHint() {
    return findChildByClass(SahaTypeHint.class);
  }

  @Override
  @NotNull
  public List<SahaValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SahaValue.class);
  }

}
