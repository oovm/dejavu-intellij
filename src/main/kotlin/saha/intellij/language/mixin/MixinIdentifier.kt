package saha.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import ygg.intellij.language.psi.ancestors
import saha.intellij.language.psi_node.YggIdentifierNode
import saha.intellij.language.psi_node.YggRuleStatementNode


enum class IdentifierKind {
    Self,
    Builtin,
    Function,
}

open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): saha.intellij.language.psi_node.YggIdentifierNode = this as saha.intellij.language.psi_node.YggIdentifierNode;

    fun getRuleStatement(): saha.intellij.language.psi_node.YggRuleStatementNode? {
        return this.ancestors
            .filter { it is saha.intellij.language.psi_node.YggRuleStatementNode }
            .map { it as saha.intellij.language.psi_node.YggRuleStatementNode }
            .firstOrNull()
    }
}