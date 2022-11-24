package saha.intellij.language.psi

import com.intellij.psi.tree.IElementType
import saha.intellij.YggdrasilLanguage

class YggElementType(debugName: String) : IElementType(debugName, saha.intellij.YggdrasilLanguage) {
    override fun toString(): String = "Yggdrasil.${super.toString()}"
}
