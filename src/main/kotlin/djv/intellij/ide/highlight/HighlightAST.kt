package djv.intellij.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import saha.intellij.language.file.SahaFileNode
import saha.intellij.language.psi.*

class HighlightAST : _root_ide_package_.djv.intellij.language.psi.SahaVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun clone(): HighlightVisitor = HighlightAST()

    override fun suitableForFile(file: PsiFile): Boolean = file is SahaFileNode

    override fun visit(element: PsiElement) = element.accept(this)

//    override fun visitRuleStatement(o: saha.intellij.language.psi.YggRuleStatement) {
//        highlight(o.define, HighlightColor.KEYWORD)
//        if (o.ruleArgument == null) {
//            highlight(o.identifier, HighlightColor.RULE_SYMBOL)
//        }
//        else {
//            highlight(o.identifier, HighlightColor.FUNCTION_SYMBOL)
//        }
//        o.ruleType?.let {
//            highlight(it.identifier, HighlightColor.RULE_SYMBOL)
//        }
//    }


    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable,
    ): Boolean {
        infoHolder = holder
        action.run()
        return true
    }

    private fun highlight(element: PsiElement, color: HighlightColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)
        infoHolder?.add(builder.create())
    }

}