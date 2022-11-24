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
import saha.intellij.language.psi.YggIdentifier;
import saha.intellij.language.psi.YggNamespace;
import saha.intellij.language.psi.YggVisitor;
import ygg.intellij.language.psi.*;

public class YggNamespaceNode extends ASTWrapperPsiElement implements YggNamespace {

  public YggNamespaceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitNamespace(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YggIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YggIdentifier.class);
  }

}
