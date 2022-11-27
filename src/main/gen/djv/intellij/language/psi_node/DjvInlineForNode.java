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

public class DjvInlineForNode extends ASTWrapperPsiElement implements DjvInlineFor {

  public DjvInlineForNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitInlineFor(this);
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
  @Nullable
  public DjvInlineElse getInlineElse() {
    return findChildByClass(DjvInlineElse.class);
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

}
