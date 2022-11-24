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

public class SahaSlotExpressionNode extends ASTWrapperPsiElement implements SahaSlotExpression {

  public SahaSlotExpressionNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitSlotExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SahaIdentifier getIdentifier() {
    return findChildByClass(SahaIdentifier.class);
  }

  @Override
  @Nullable
  public SahaSlotEnd getSlotEnd() {
    return findChildByClass(SahaSlotEnd.class);
  }

  @Override
  @NotNull
  public SahaSlotStart getSlotStart() {
    return findNotNullChildByClass(SahaSlotStart.class);
  }

}
