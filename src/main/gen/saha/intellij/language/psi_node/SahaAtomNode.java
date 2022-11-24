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

public class SahaAtomNode extends ASTWrapperPsiElement implements SahaAtom {

  public SahaAtomNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SahaBranchMark getBranchMark() {
    return findChildByClass(SahaBranchMark.class);
  }

  @Override
  @Nullable
  public SahaExpr getExpr() {
    return findChildByClass(SahaExpr.class);
  }

  @Override
  @Nullable
  public SahaFieldMark getFieldMark() {
    return findChildByClass(SahaFieldMark.class);
  }

  @Override
  @Nullable
  public SahaFunctionCall getFunctionCall() {
    return findChildByClass(SahaFunctionCall.class);
  }

  @Override
  @Nullable
  public SahaValue getValue() {
    return findChildByClass(SahaValue.class);
  }

}
