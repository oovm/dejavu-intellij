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
import saha.intellij.language.psi.*;
import saha.intellij.language.psi.*;

public class YggValueNode extends ASTWrapperPsiElement implements YggValue {

  public YggValueNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YggVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YggVisitor) accept((YggVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YggCharset getCharset() {
    return findChildByClass(YggCharset.class);
  }

  @Override
  @Nullable
  public YggNamespace getNamespace() {
    return findChildByClass(YggNamespace.class);
  }

  @Override
  @Nullable
  public YggNumberSuffix getNumberSuffix() {
    return findChildByClass(YggNumberSuffix.class);
  }

  @Override
  @Nullable
  public YggStringLiteral getStringLiteral() {
    return findChildByClass(YggStringLiteral.class);
  }

  @Override
  @Nullable
  public YggTable getTable() {
    return findChildByClass(YggTable.class);
  }

}
