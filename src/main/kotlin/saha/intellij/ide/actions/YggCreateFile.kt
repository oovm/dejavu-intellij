package saha.intellij.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import saha.intellij.language.SahaLanguage
import saha.intellij.language.file.SahaBundle
import saha.intellij.language.file.SahaIcon

class YggCreateFile : CreateFileFromTemplateAction(Name, Description, SahaIcon.FILE) {
    companion object {
        val Name = SahaLanguage.id
        const val TemplateName = "Voml File";
        val Description = SahaBundle.message("action.create.description")
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(Name).addKind("Empty file", SahaIcon.FILE, TemplateName)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = Name
}
