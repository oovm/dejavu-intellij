// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SahaRuleStatement extends PsiElement {

  @NotNull
  SahaDefine getDefine();

  @NotNull
  SahaIdentifier getIdentifier();

  @NotNull
  SahaModifiers getModifiers();

  @Nullable
  SahaRuleArgument getRuleArgument();

  @Nullable
  SahaRuleBody getRuleBody();

  @Nullable
  SahaRuleType getRuleType();

}
