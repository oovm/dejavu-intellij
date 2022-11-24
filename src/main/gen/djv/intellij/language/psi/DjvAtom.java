// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DjvAtom extends PsiElement {

  @Nullable
  DjvBranchMark getBranchMark();

  @Nullable
  DjvExpr getExpr();

  @Nullable
  DjvFieldMark getFieldMark();

  @Nullable
  DjvFunctionCall getFunctionCall();

  @Nullable
  DjvValue getValue();

}
