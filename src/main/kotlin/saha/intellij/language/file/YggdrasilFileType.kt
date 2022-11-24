package saha.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object YggdrasilFileType : LanguageFileType(saha.intellij.SahaLanguage) {
    override fun getName(): String = saha.intellij.SahaLanguage.id
    override fun getDescription(): String = YggdrasilBundle.message("filetype.description")
    override fun getDefaultExtension(): String = saha.intellij.SahaLanguage.FileExtension
    override fun getIcon(): Icon = YggdrasilIcon.FILE
}