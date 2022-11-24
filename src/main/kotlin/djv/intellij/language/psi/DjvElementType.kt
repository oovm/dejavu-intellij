package djv.intellij.language.psi

import com.intellij.psi.tree.IElementType
import djv.intellij.language.DjvLanguage

class DjvElementType(debugName: String) : IElementType(debugName, DjvLanguage) {
    override fun toString(): String = "Saha.${super.toString()}"
}
