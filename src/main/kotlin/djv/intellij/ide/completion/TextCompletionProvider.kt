package djv.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.util.ProcessingContext
import djv.intellij.language.file.DjvIcon
import javax.swing.Icon

class TextCompletionProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters, context: ProcessingContext, resultSet: CompletionResultSet
    ) {
        resultSet.addSlot(
            "for-i-slot", "for i in items", """
            {% for i in body %}
                
            {% end %}
            """, -10
        )
        resultSet.addSlot(
            "for-kv-slot", "for k, v in items", """
            {% for k, v in body %}
                
            {% end %}
            """, -10
        )
        resultSet.addSlot(
            "for-else-slot", "for .. else", """
            {% for i in body %}
                
            {% else %}
                
            {% end %}
            """, -10
        )
        resultSet.addInline(
            "for-i-inline", "for i in items", """
            {% for i in body {} %}
            """
        )
        resultSet.addInline(
            "for-kv-inline", "for k, v in items", """
            {% for k, v in body {} %}
            """
        )
        resultSet.addSlot(
            "if-slot", "if", """
            {% if condition %}
                
            {% end %}
            """, -10
        )
        resultSet.addInline(
            "if-inline", "if", """
            {% if condition {} %}
            """
        )
        resultSet.addSlot(
            "else", "else", """
            {% else %}
            """
        )
        resultSet.addElement(
            "variable", "variable", """
            {%  %}
            """, icon = DjvIcon.VARIABLE, shift = -3
        )
    }

    private fun CompletionResultSet.addSlot(
        keys: String, showText: String, insertText: String, shift: Int = 0
    ) {
        this.addElement(keys, "{% $showText %}", insertText, icon = DjvIcon.SLOT, shift = shift)
    }

    private fun CompletionResultSet.addInline(
        keys: String, showText: String, insertText: String, shift: Int = 0
    ) {
        this.addElement(keys, showText, insertText, icon = DjvIcon.INLINE, shift = shift)
    }

    private fun CompletionResultSet.addElement(
        keys: String,
        showText: String,
        insertText: String,
        typeText: String? = null,
        tailText: String? = null,
        icon: Icon? = null,
        shift: Int = 0
    ) {
        val e = LookupElementBuilder.create(keys).withCaseSensitivity(false).withPresentableText(showText)
            .withTailText(tailText, true).withTypeText(typeText).withIcon(icon).withInsertHandler { context, _ ->
                val document = context.document
                document.replaceString(context.startOffset, context.tailOffset, insertText.trimIndent())
                EditorModificationUtil.moveCaretRelatively(context.editor, shift)
            };
        this.addElement(e)
    }
}