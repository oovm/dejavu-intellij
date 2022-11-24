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

public class DjvRuleStatementNode extends ASTWrapperPsiElement implements DjvRuleStatement {

  public DjvRuleStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitRuleStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjvDefine getDefine() {
    return findNotNullChildByClass(DjvDefine.class);
  }

  @Override
  @NotNull
  public DjvIdentifier getIdentifier() {
    return findNotNullChildByClass(DjvIdentifier.class);
  }

  @Override
  @NotNull
  public DjvModifiers getModifiers() {
    return findNotNullChildByClass(DjvModifiers.class);
  }

  @Override
  @Nullable
  public DjvRuleArgument getRuleArgument() {
    return findChildByClass(DjvRuleArgument.class);
  }

  @Override
  @Nullable
  public DjvRuleBody getRuleBody() {
    return findChildByClass(DjvRuleBody.class);
  }

  @Override
  @Nullable
  public DjvRuleType getRuleType() {
    return findChildByClass(DjvRuleType.class);
  }

}
