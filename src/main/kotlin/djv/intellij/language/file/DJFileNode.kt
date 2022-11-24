package djv.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import djv.intellij.language.DJLanguage
import javax.swing.Icon

class DJFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DJLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = SahaFileType
    override fun getPresentableText(): String {
        return DJBundle.message("action.create")
    }
    override fun getIcon(unused: Boolean): Icon {
        return DJIcon.FILE
    }
}