package djv.intellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import djv.intellij.language.DjvLanguage
import djv.intellij.language.file.DjvBundle
import djv.intellij.language.file.DJIcon

class YggCreateFile : CreateFileFromTemplateAction(Name, Description, DJIcon.FILE) {
    companion object {
        val Name = DjvLanguage.id
        const val TemplateName = "Voml File";
        val Description = DjvBundle.message("action.create.description")
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(Name).addKind("Empty file", DJIcon.FILE, TemplateName)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = Name
}
