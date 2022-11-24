package saha.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import saha.intellij.language.psi.SahaTypes

class YCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(saha.intellij.language.psi.SahaTypes.SYMBOL),
            SymbolCompletionProvider()
        )
    }
}

