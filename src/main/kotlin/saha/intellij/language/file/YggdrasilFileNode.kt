package saha.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import saha.intellij.YggdrasilLanguage
import javax.swing.Icon

class YggdrasilFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, saha.intellij.YggdrasilLanguage),
    ItemPresentation {
    override fun getFileType(): FileType = YggdrasilFileType
    override fun getPresentableText(): String {
        return YggdrasilBundle.message("action.create")
    }
    override fun getIcon(unused: Boolean): Icon {
        return YggdrasilIcon.FILE
    }
}