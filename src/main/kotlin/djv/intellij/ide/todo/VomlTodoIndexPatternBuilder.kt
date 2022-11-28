package djv.intellij.ide.todo

import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import djv.intellij.language.DjvLexerAdapter
import djv.intellij.language.DjvParserDefinition
import djv.intellij.language.file.DjvFileNode

class VomlTodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? =
        if (file is DjvFileNode) DjvLexerAdapter() else null

    override fun getCommentTokenSet(file: PsiFile): TokenSet? =
        if (file is DjvFileNode) DjvParserDefinition.COMMENTS else null

    override fun getCommentStartDelta(tokenType: IElementType?): Int =
        if (tokenType in DjvParserDefinition.COMMENTS) 2 else 0

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
