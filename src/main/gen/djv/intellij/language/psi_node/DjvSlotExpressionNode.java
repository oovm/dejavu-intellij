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

public class DjvSlotExpressionNode extends ASTWrapperPsiElement implements DjvSlotExpression {

  public DjvSlotExpressionNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitSlotExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DjvIdentifier getIdentifier() {
    return findChildByClass(DjvIdentifier.class);
  }

  @Override
  @Nullable
  public DjvInlineForStatement getInlineForStatement() {
    return findChildByClass(DjvInlineForStatement.class);
  }

  @Override
  @Nullable
  public DjvInlineIfStatement getInlineIfStatement() {
    return findChildByClass(DjvInlineIfStatement.class);
  }

  @Override
  @NotNull
  public DjvSlotL getSlotL() {
    return findNotNullChildByClass(DjvSlotL.class);
  }

  @Override
  @NotNull
  public DjvSlotR getSlotR() {
    return findNotNullChildByClass(DjvSlotR.class);
  }

}
