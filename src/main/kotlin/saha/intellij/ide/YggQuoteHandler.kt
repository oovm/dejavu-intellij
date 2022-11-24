package saha.intellij.ide

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import saha.intellij.language.psi.YggTypes

class YggQuoteHandler : SimpleTokenSetQuoteHandler(saha.intellij.language.psi.YggTypes.STRING_LITERAL)
