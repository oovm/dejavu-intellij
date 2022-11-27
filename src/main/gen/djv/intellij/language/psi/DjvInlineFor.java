// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvInlineFor extends PsiElement {

  @NotNull
  DjvExpression getExpression();

  @Nullable
  DjvInlineElse getInlineElse();

  @NotNull
  DjvKwIn getKwIn();

  @NotNull
  DjvPattern getPattern();

}
