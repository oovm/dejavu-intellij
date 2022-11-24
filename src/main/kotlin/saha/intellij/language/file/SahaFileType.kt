package saha.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import saha.intellij.SahaLanguage
import javax.swing.Icon

object SahaFileType : LanguageFileType(SahaLanguage) {
    override fun getName(): String = SahaLanguage.id
    override fun getDescription(): String = YggdrasilBundle.message("filetype.description")
    override fun getDefaultExtension(): String = SahaLanguage.FileExtension
    override fun getIcon(): Icon = YggdrasilIcon.FILE
}