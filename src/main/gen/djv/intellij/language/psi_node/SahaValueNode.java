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

public class SahaValueNode extends ASTWrapperPsiElement implements SahaValue {

  public SahaValueNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SahaCharset getCharset() {
    return findChildByClass(SahaCharset.class);
  }

  @Override
  @Nullable
  public SahaNamespace getNamespace() {
    return findChildByClass(SahaNamespace.class);
  }

  @Override
  @Nullable
  public SahaNumberSuffix getNumberSuffix() {
    return findChildByClass(SahaNumberSuffix.class);
  }

  @Override
  @Nullable
  public SahaStringLiteral getStringLiteral() {
    return findChildByClass(SahaStringLiteral.class);
  }

  @Override
  @Nullable
  public SahaTable getTable() {
    return findChildByClass(SahaTable.class);
  }

}
