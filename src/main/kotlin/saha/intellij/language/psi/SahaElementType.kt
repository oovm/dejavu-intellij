package saha.intellij.language.psi

import com.intellij.psi.tree.IElementType
import saha.intellij.language.SahaLanguage

class SahaElementType(debugName: String) : IElementType(debugName, SahaLanguage) {
    override fun toString(): String = "Saha.${super.toString()}"
}
