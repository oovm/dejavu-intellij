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

public class DjvSlotForElseNode extends ASTWrapperPsiElement implements DjvSlotForElse {

  public DjvSlotForElseNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitSlotForElse(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjvSlotElse getSlotElse() {
    return findNotNullChildByClass(DjvSlotElse.class);
  }

  @Override
  @Nullable
  public DjvSlotExpression getSlotExpression() {
    return findChildByClass(DjvSlotExpression.class);
  }

  @Override
  @Nullable
  public DjvSlotFor getSlotFor() {
    return findChildByClass(DjvSlotFor.class);
  }

  @Override
  @Nullable
  public DjvTextStatement getTextStatement() {
    return findChildByClass(DjvTextStatement.class);
  }

}
