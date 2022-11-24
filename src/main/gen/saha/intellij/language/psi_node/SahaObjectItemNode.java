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

public class SahaObjectItemNode extends ASTWrapperPsiElement implements SahaObjectItem {

  public SahaObjectItemNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitObjectItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SahaObjectKey getObjectKey() {
    return findNotNullChildByClass(SahaObjectKey.class);
  }

  @Override
  @NotNull
  public SahaValue getValue() {
    return findNotNullChildByClass(SahaValue.class);
  }

}
