// This is a generated file. Not intended for manual editing.
package saha.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SahaTable extends PsiElement {

  @NotNull
  List<SahaPair> getPairList();

  @Nullable
  SahaTypeHint getTypeHint();

  @NotNull
  List<SahaValue> getValueList();

}
