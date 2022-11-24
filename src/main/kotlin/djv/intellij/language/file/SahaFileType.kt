package djv.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import djv.intellij.language.DJLanguage
import javax.swing.Icon

object SahaFileType : LanguageFileType(DJLanguage) {
    override fun getName(): String = DJLanguage.id
    override fun getDescription(): String = DJBundle.message("filetype.description")
    override fun getDefaultExtension(): String = DJLanguage.FileExtension
    override fun getIcon(): Icon = DJIcon.FILE
}