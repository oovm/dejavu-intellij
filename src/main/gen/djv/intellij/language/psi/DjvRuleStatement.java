// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvRuleStatement extends PsiElement {

  @NotNull
  DjvDefine getDefine();

  @NotNull
  DjvIdentifier getIdentifier();

  @NotNull
  DjvModifiers getModifiers();

  @Nullable
  DjvRuleArgument getRuleArgument();

  @Nullable
  DjvRuleBody getRuleBody();

  @Nullable
  DjvRuleType getRuleType();

}
