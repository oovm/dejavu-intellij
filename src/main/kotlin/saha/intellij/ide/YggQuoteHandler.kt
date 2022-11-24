package saha.intellij.ide

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import saha.intellij.language.psi.SahaTypes

class YggQuoteHandler : SimpleTokenSetQuoteHandler(saha.intellij.language.psi.SahaTypes.STRING_LITERAL)
