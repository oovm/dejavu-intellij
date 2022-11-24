package saha.intellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import saha.intellij.language.file.YggdrasilBundle
import saha.intellij.language.file.YggdrasilIcon

class YggCreateFile : CreateFileFromTemplateAction(Name, Description, YggdrasilIcon.FILE) {
    companion object {
        val Name = saha.intellij.SahaLanguage.id
        const val TemplateName = "Voml File";
        val Description = YggdrasilBundle.message("action.create.description")
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(Name).addKind("Empty file", YggdrasilIcon.FILE, TemplateName)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = Name
}
