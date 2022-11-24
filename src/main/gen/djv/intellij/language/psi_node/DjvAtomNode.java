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

public class DjvAtomNode extends ASTWrapperPsiElement implements DjvAtom {

  public DjvAtomNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DjvBranchMark getBranchMark() {
    return findChildByClass(DjvBranchMark.class);
  }

  @Override
  @Nullable
  public DjvExpr getExpr() {
    return findChildByClass(DjvExpr.class);
  }

  @Override
  @Nullable
  public DjvFieldMark getFieldMark() {
    return findChildByClass(DjvFieldMark.class);
  }

  @Override
  @Nullable
  public DjvFunctionCall getFunctionCall() {
    return findChildByClass(DjvFunctionCall.class);
  }

  @Override
  @Nullable
  public DjvValue getValue() {
    return findChildByClass(DjvValue.class);
  }

}
