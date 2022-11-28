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

public class DjvDotCallNode extends ASTWrapperPsiElement implements DjvDotCall {

  public DjvDotCallNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitDotCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DjvFunctionArgs getFunctionArgs() {
    return findChildByClass(DjvFunctionArgs.class);
  }

  @Override
  @NotNull
  public DjvIdentifier getIdentifier() {
    return findNotNullChildByClass(DjvIdentifier.class);
  }

}
