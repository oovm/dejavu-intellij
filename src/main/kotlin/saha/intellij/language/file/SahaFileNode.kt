package saha.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import saha.intellij.SahaLanguage
import javax.swing.Icon

class SahaFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SahaLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = SahaFileType
    override fun getPresentableText(): String {
        return YggdrasilBundle.message("action.create")
    }
    override fun getIcon(unused: Boolean): Icon {
        return YggdrasilIcon.FILE
    }
}