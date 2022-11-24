package djv.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import djv.intellij.language.DjvLanguage
import javax.swing.Icon

object DjvFileType : LanguageFileType(DjvLanguage) {
    override fun getName(): String = DjvLanguage.id
    override fun getDescription(): String = DjvBundle.message("filetype.description")
    override fun getDefaultExtension(): String = DjvLanguage.FileExtension
    override fun getIcon(): Icon = DJIcon.FILE
}