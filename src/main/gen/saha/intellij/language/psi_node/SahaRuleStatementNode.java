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

public class SahaRuleStatementNode extends ASTWrapperPsiElement implements SahaRuleStatement {

  public SahaRuleStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitRuleStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SahaDefine getDefine() {
    return findNotNullChildByClass(SahaDefine.class);
  }

  @Override
  @NotNull
  public SahaIdentifier getIdentifier() {
    return findNotNullChildByClass(SahaIdentifier.class);
  }

  @Override
  @NotNull
  public SahaModifiers getModifiers() {
    return findNotNullChildByClass(SahaModifiers.class);
  }

  @Override
  @Nullable
  public SahaRuleArgument getRuleArgument() {
    return findChildByClass(SahaRuleArgument.class);
  }

  @Override
  @Nullable
  public SahaRuleBody getRuleBody() {
    return findChildByClass(SahaRuleBody.class);
  }

  @Override
  @Nullable
  public SahaRuleType getRuleType() {
    return findChildByClass(SahaRuleType.class);
  }

}
