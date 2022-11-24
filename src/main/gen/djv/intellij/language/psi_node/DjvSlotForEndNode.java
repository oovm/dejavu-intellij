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

public class DjvSlotForEndNode extends ASTWrapperPsiElement implements DjvSlotForEnd {

  public DjvSlotForEndNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DjvVisitor visitor) {
    visitor.visitSlotForEnd(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DjvVisitor) accept((DjvVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DjvKwEndFor getKwEndFor() {
    return findNotNullChildByClass(DjvKwEndFor.class);
  }

  @Override
  @NotNull
  public DjvSlotEnd getSlotEnd() {
    return findNotNullChildByClass(DjvSlotEnd.class);
  }

  @Override
  @NotNull
  public DjvSlotStart getSlotStart() {
    return findNotNullChildByClass(DjvSlotStart.class);
  }

}
