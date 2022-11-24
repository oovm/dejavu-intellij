package saha.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import saha.intellij.language.SahaLanguage
import javax.swing.Icon

object SahaFileType : LanguageFileType(SahaLanguage) {
    override fun getName(): String = SahaLanguage.id
    override fun getDescription(): String = SahaBundle.message("filetype.description")
    override fun getDefaultExtension(): String = SahaLanguage.FileExtension
    override fun getIcon(): Icon = SahaIcon.FILE
}