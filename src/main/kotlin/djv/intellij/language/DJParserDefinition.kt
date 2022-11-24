package djv.intellij.language


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
import djv.intellij.language.file.DJFileNode
import djv.intellij.language.parser.DjvParser
import djv.intellij.language.psi.DjvTypes.*


class DJParserDefinition : ParserDefinition {
    companion object {
        val COMMENTS = TokenSet.create(COMMENT_LINE, COMMENT_BLOCK, COMMENT_BLOCK)
        val STRING_LITERALS = TokenSet.create(STRING_LITERAL)
        val FILE = IFileElementType(DJLanguage)
    }

    override fun createLexer(project: Project): Lexer = DjvLexerAdapter()

    override fun createParser(project: Project): PsiParser = DjvParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = DJFileNode(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MAY
    }
}
