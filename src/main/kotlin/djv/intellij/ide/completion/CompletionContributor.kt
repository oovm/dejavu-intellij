package djv.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.PsiElement
import djv.intellij.language.psi.DjvTypes

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(DjvTypes.SYMBOL),
            SlotCompletionProvider()
        )
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(DjvTypes.SAHA_TEXT),
            TextCompletionProvider()
        )
    }

}
