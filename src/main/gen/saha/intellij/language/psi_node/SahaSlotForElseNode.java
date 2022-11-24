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

public class SahaSlotForElseNode extends ASTWrapperPsiElement implements SahaSlotForElse {

  public SahaSlotForElseNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitSlotForElse(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SahaSlotElse getSlotElse() {
    return findNotNullChildByClass(SahaSlotElse.class);
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
  public SahaTextStatement getTextStatement() {
    return findChildByClass(SahaTextStatement.class);
  }

}
