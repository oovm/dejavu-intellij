package saha.intellij.language


import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import saha.intellij.language.file.SahaFileNode
import saha.intellij.language.parser.SahaParser
import saha.intellij.language.psi.SahaTypes.*


class SahaParserDefinition : ParserDefinition {
    companion object {
        val COMMENTS = TokenSet.create(COMMENT_LINE, COMMENT_BLOCK, COMMENT_BLOCK)
        val STRING_LITERALS = TokenSet.create(STRING_LITERAL)
        val FILE = IFileElementType(SahaLanguage)
    }

    override fun createLexer(project: Project): Lexer = SahaLexerAdapter()

    override fun createParser(project: Project): PsiParser = SahaParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = SahaFileNode(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MAY
    }
}
