// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvSlotExpression extends PsiElement {

  @Nullable
  DjvIdentifier getIdentifier();

  @Nullable
  DjvInlineFor getInlineFor();

  @Nullable
  DjvInlineIf getInlineIf();

  @NotNull
  DjvSlotL getSlotL();

  @NotNull
  DjvSlotR getSlotR();

}
