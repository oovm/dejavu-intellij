package saha.intellij.language.psi

import com.intellij.psi.tree.IElementType

class YggElementType(debugName: String) : IElementType(debugName, saha.intellij.SahaLanguage) {
    override fun toString(): String = "Yggdrasil.${super.toString()}"
}
