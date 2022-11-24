package djv.intellij.language.psi

import com.intellij.psi.tree.IElementType
import djv.intellij.language.DJLanguage

class DjvElementType(debugName: String) : IElementType(debugName, DJLanguage) {
    override fun toString(): String = "Saha.${super.toString()}"
}
