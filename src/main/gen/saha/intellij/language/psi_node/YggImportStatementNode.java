// This is a generated file. Not intended for manual editing.
package saha.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static saha.intellij.language.psi.YggTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import saha.intellij.language.psi.YggImportBody;
import saha.intellij.language.psi.YggImportStatement;
import saha.intellij.language.psi.YggStringLiteral;
import saha.intellij.language.psi.YggVisitor;
import saha.intellij.language.psi.*;

public class YggImportStatementNode extends ASTWrapperPsiElement implements YggImportStatement {

  public YggImportStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitImportStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggImportBody getImportBody() {
    return findChildByClass(YggImportBody.class);
  }

  @Override
  @NotNull
  public YggStringLiteral getStringLiteral() {
    return findNotNullChildByClass(YggStringLiteral.class);
  }

}
