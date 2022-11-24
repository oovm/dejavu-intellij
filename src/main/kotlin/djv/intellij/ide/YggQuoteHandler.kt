package djv.intellij.ide

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import djv.intellij.language.psi.DjvTypes

class YggQuoteHandler : SimpleTokenSetQuoteHandler(DjvTypes.STRING_LITERAL)
