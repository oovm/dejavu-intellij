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

public class DjvExprNode extends ASTWrapperPsiElement implements DjvExpr {

  public DjvExprNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DjvInfix> getInfixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvInfix.class);
  }

  @Override
  @NotNull
  public List<DjvTerm> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DjvTerm.class);
  }

}
