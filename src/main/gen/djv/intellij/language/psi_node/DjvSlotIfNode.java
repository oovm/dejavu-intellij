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

public class DjvSlotIfNode extends ASTWrapperPsiElement implements DjvSlotIf {

  public DjvSlotIfNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitSlotIf(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DjvSlotExpression> getSlotExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvSlotExpression.class);
  }

  @Override
  @NotNull
  public List<DjvSlotFor> getSlotForList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvSlotFor.class);
  }

  @Override
  @NotNull
  public List<DjvSlotIf> getSlotIfList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvSlotIf.class);
  }

  @Override
  @Nullable
  public DjvSlotIfElse getSlotIfElse() {
    return findChildByClass(DjvSlotIfElse.class);
  }

  @Override
  @Nullable
  public DjvSlotIfEnd getSlotIfEnd() {
    return findChildByClass(DjvSlotIfEnd.class);
  }

  @Override
  @NotNull
  public DjvSlotIfStart getSlotIfStart() {
    return findNotNullChildByClass(DjvSlotIfStart.class);
  }

  @Override
  @NotNull
  public List<DjvTextStatement> getTextStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvTextStatement.class);
  }

}
