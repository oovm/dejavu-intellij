package saha.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import saha.intellij.YggdrasilLanguage
import javax.swing.Icon

object YggdrasilFileType : LanguageFileType(saha.intellij.YggdrasilLanguage) {
    override fun getName(): String = saha.intellij.YggdrasilLanguage.id
    override fun getDescription(): String = YggdrasilBundle.message("filetype.description")
    override fun getDefaultExtension(): String = saha.intellij.YggdrasilLanguage.FileExtension
    override fun getIcon(): Icon = YggdrasilIcon.FILE
}