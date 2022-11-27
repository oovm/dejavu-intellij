package djv.intellij.language.file

import com.intellij.icons.AllIcons
import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class DjvIcon : IconProvider() {
    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        return null
    }

    companion object {
        val FILE = IconLoader.getIcon("/icons/DjvIcon.svg", DjvIcon::class.java)
        val SLOT = AllIcons.Nodes.Deploy
        val INLINE = AllIcons.Nodes.EntryPoints
        val VARIABLE = AllIcons.Nodes.Variable
    }
}
