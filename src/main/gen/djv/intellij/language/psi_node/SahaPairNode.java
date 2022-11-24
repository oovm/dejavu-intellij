// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi_node;

import java.util.List;

import djv.intellij.language.psi.SahaPair;
import djv.intellij.language.psi.SahaSymbolPath;
import djv.intellij.language.psi.SahaValue;
import djv.intellij.language.psi.SahaVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static djv.intellij.language.psi.SahaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import saha.intellij.language.psi.*;

public class SahaPairNode extends ASTWrapperPsiElement implements SahaPair {

  public SahaPairNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitPair(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SahaSymbolPath getSymbolPath() {
    return findNotNullChildByClass(SahaSymbolPath.class);
  }

  @Override
  @NotNull
  public SahaValue getValue() {
    return findNotNullChildByClass(SahaValue.class);
  }

}
