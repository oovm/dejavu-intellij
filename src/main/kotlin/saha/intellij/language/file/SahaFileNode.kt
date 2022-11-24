package saha.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import saha.intellij.language.SahaLanguage
import javax.swing.Icon

class SahaFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SahaLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = SahaFileType
    override fun getPresentableText(): String {
        return SahaBundle.message("action.create")
    }
    override fun getIcon(unused: Boolean): Icon {
        return SahaIcon.FILE
    }
}