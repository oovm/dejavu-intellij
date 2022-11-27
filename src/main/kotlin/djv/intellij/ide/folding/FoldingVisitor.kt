package djv.intellij.ide.folding

import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import djv.intellij.language.psi.*

class FoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : DJRecursiveVisitor() {

    override fun visitComment(comment: PsiComment) {
        if (comment.tokenType == DjvTypes.COMMENT_BLOCK) {
            fold(comment)
            super.visitComment(comment)
        }
    }


    override fun visitSlotIfStatement(o: DjvSlotIfStatement) {
        val start = o.slotIfStart.childElement(DjvTypes.KW_IF)?.endOffset;
        val end = o.slotIfEnd?.childElement(DjvTypes.KW_IF)?.endOffset;
        fold(o, start, end, " ... ")
    }

    override fun visitSlotForStatement(o: DjvSlotForStatement) {
        val start = o.slotForStart.childElement(DjvTypes.KW_IF)?.endOffset;
        val end = o.slotForEnd?.childElement(DjvTypes.KW_IF)?.endOffset;
        fold(o, start, end, " ... ")
    }

//
//    override fun visitObject(o: djv.intellij.language.psi.YggObject) {
//        foldInner(o)
//    }
//
//
//    override fun visitImportBody(o: djv.intellij.language.psi.YggImportBody) {
//        foldInner(o)
//    }
//
//
//    override fun visitRuleBody(o: djv.intellij.language.psi.YggRuleBody) {
//        foldInner(o)
//    }


    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }

    private fun fold(element: PsiElement, placeholder: String = "...", collapse: Boolean = false) {
        descriptors += FoldingDescriptor(element.node, element.textRange, null, setOf(), false, placeholder, collapse)
    }

    private fun fold(
        element: PsiElement, start: Int?, end: Int?, placeholder: String = "...", collapse: Boolean = false
    ) {
        if (start != null && end != null && start < end) {
            val range = TextRange(start, end)
            descriptors += FoldingDescriptor(
                element.node, range, null, setOf(), false, placeholder, collapse
            )
        }
    }
}
