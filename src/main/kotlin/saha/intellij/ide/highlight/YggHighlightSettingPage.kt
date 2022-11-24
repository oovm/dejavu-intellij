package saha.intellij.ide.highlight


import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import saha.intellij.language.file.SahaBundle
import saha.intellij.language.file.SahaIcon

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

    override fun getDisplayName() = SahaBundle.message("filetype.name")

    override fun getIcon() = SahaIcon.FILE

    override fun getHighlighter() = HighlightToken()

    override fun getDemoText() =
        """@grammar <PREDEFINED>ygg</PREDEFINED> {"*.yg","*.ygg", "*.grammar"};

// Import the predefined types,
// Otherwise the `String` type of each language will be used directly to represent the atomic expression
@import "literal_types.toml";

@ignore {NEWLINE, WHITESPACE, COMMENT}
"""

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags
}
