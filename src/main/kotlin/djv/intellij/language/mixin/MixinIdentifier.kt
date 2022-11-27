package djv.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import djv.intellij.language.psi.ancestors


open class MixinIdentifier(node: ASTNode) : ASTWrapperPsiElement(node) {

}