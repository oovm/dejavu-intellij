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

public class DjvSlotForStartNode extends ASTWrapperPsiElement implements DjvSlotForStart {

  public DjvSlotForStartNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitSlotForStart(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjvExpression getExpression() {
    return findNotNullChildByClass(DjvExpression.class);
  }

  @Override
  @NotNull
  public DjvKwIn getKwIn() {
    return findNotNullChildByClass(DjvKwIn.class);
  }

  @Override
  @NotNull
  public DjvPattern getPattern() {
    return findNotNullChildByClass(DjvPattern.class);
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
