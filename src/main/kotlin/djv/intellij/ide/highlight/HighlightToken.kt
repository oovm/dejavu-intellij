package djv.intellij.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import djv.intellij.language.DjvLexerAdapter
import djv.intellij.language.psi.DjvTypes.*
import djv.intellij.ide.highlight.HighlightColor as Color

class HighlightToken : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return DjvLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): Color? {
        return when (tokenType) {
            //
            KW_USE, AS, KW_END -> Color.KEYWORD
            KW_IF, KW_ELSE_IF, KW_ELSE, KW_END_IF -> Color.KEYWORD
            KW_FOR, KW_END_FOR -> Color.KEYWORD
            KW_LET -> Color.KEYWORD
            // ANNOTATION, ANNOTATION_MARK -> Color.ANNOTATION
            OPTIONAL -> Color.KEYWORD
            ADD, SUB, MUL, DIV, MOD -> Color.OPERATOR
            EQ, NE -> Color.OPERATOR
            //
            NUMBER_SUFFIX -> Color.NUMBER_HINT
            TYPE_HINT -> Color.TYPE_HINT
            // INSERT_DOT, INSERT_STAR -> Color.INSERT_MARK
            //
            PARENTHESIS_L, PARENTHESIS_R -> Color.PARENTHESES
            BRACKET_L, BRACKET_R -> Color.BRACKETS
            BRACE_L, BRACE_R -> Color.BRACES
            COLON, EQ -> Color.SET
            COMMA -> Color.COMMA
            // atom
            KW_SPECIAL -> Color.INTEGER
            STRING_LITERAL, STRING_SQ, STRING_DQ, CHARACTER -> Color.STRING
            ESCAPE_SPECIAL, ESCAPE_UNICODE -> Color.STRING_ESCAPE
            NUMBER_SUFFIX -> Color.NUMBER_HINT
            INTEGER -> Color.INTEGER
            DECIMAL -> Color.DECIMAL

            SYMBOL -> Color.IDENTIFIER
            // 注释
            COMMENT_LINE -> Color.COMMENT_INLINE
            COMMENT_BLOCK -> Color.COMMENT_BLOCK
            COMMENT_DOC -> Color.COMMENT_BLOCK
            // 错误
            TokenType.BAD_CHARACTER -> Color.BAD_CHARACTER
            else -> null
        }
    }
}
