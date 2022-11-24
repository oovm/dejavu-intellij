package djv.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import saha.intellij.language.psi.ancestors

enum class IdentifierKind {
    Self,
    Builtin,
    Function,
}

open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {

}