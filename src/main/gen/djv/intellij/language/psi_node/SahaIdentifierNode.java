// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi_node;

import java.util.List;

import djv.intellij.language.mixin.MixinIdentifier;
import djv.intellij.language.psi.SahaIdentifier;
import djv.intellij.language.psi.SahaVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static djv.intellij.language.psi.SahaTypes.*;
import saha.intellij.language.mixin.MixinIdentifier;
import saha.intellij.language.psi.*;

public class SahaIdentifierNode extends MixinIdentifier implements SahaIdentifier {

  public SahaIdentifierNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SahaVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SahaVisitor) accept((SahaVisitor)visitor);
    else super.accept(visitor);
  }

}
