package djv.intellij.ide.highlight


import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import djv.intellij.language.file.DjvBundle
import djv.intellij.language.file.DjvIcon

class YggHighlightSettingPage : ColorSettingsPage {
    private val attrs = HighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    private val annotatorTags = HighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = attrs

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = DjvBundle.message("filetype.name")

    override fun getIcon() = DjvIcon.FILE

    override fun getHighlighter() = HighlightToken()

    override fun getDemoText() = javaClass.getResource("/fileTemplates/demoColor.html")!!.readText()
    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags
}
