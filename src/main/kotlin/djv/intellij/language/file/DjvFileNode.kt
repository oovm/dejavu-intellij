package djv.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import djv.intellij.language.DjvLanguage
import javax.swing.Icon

class DjvFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DjvLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = DjvFileType
    override fun getPresentableText(): String {
        return DjvBundle.message("action.create")
    }
    override fun getIcon(unused: Boolean): Icon {
        return DjvIcon.FILE
    }
}