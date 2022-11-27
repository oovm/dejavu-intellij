package djv.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import djv.intellij.language.psi.DjvTypes

class YCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(DjvTypes.SYMBOL),
            SlotCompletionProvider()
        )
    }
}

