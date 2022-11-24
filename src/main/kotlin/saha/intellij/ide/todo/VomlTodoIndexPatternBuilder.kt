package saha.intellij.ide.todo

import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import saha.intellij.language.YggLexerAdapter
import saha.intellij.language.YggParserDefinition
import saha.intellij.language.file.YggdrasilFileNode

class VomlTodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? =
        if (file is YggdrasilFileNode) YggLexerAdapter() else null

    override fun getCommentTokenSet(file: PsiFile): TokenSet? =
        if (file is YggdrasilFileNode) YggParserDefinition.COMMENTS else null

    override fun getCommentStartDelta(tokenType: IElementType?): Int =
        if (tokenType in YggParserDefinition.COMMENTS) 2 else 0

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
