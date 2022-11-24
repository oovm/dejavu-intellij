package djv.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import djv.intellij.language.psi.SahaTypes

class YCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(_root_ide_package_.djv.intellij.language.psi.SahaTypes.SYMBOL),
            SymbolCompletionProvider()
        )
    }
}

