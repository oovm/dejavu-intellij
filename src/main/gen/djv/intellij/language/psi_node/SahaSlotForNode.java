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

public class SahaSlotForNode extends ASTWrapperPsiElement implements SahaSlotFor {

  public SahaSlotForNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitSlotFor(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SahaSlotExpression getSlotExpression() {
    return findChildByClass(SahaSlotExpression.class);
  }

  @Override
  @Nullable
  public SahaSlotFor getSlotFor() {
    return findChildByClass(SahaSlotFor.class);
  }

  @Override
  @Nullable
  public SahaSlotForElse getSlotForElse() {
    return findChildByClass(SahaSlotForElse.class);
  }

  @Override
  @Nullable
  public SahaSlotForEnd getSlotForEnd() {
    return findChildByClass(SahaSlotForEnd.class);
  }

  @Override
  @NotNull
  public SahaSlotForStart getSlotForStart() {
    return findNotNullChildByClass(SahaSlotForStart.class);
  }

  @Override
  @Nullable
  public SahaTextStatement getTextStatement() {
    return findChildByClass(SahaTextStatement.class);
  }

}
