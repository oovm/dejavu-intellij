package djv.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import djv.intellij.language.DjvLanguage
import djv.intellij.language.psi.DjvTypes

data class FormatContext(val commonSettings: CommonCodeStyleSettings, val spacingBuilder: SpacingBuilder) {
    companion object {
        fun create(settings: CodeStyleSettings): FormatContext {
            val commonSettings = settings.getCommonSettings(DjvLanguage)
            return FormatContext(commonSettings, createSpacingBuilder(commonSettings))
        }
    }
}

private fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder =
    SpacingBuilder(commonSettings)
        // ,
        .after(DjvTypes.COMMA).spacing(1, 1, 0, true, 0)
        .before(DjvTypes.COMMA).spaceIf(false)
        // [ ]
        .after(DjvTypes.BRACKET_L).spaceIf(false)
        .before(DjvTypes.BRACKET_R).spaceIf(false)
        // { }
        .after(DjvTypes.BRACE_L).spaceIf(false)
        .before(DjvTypes.BRACE_R).spaceIf(false)
        // ( )
        .after(DjvTypes.PARENTHESIS_L).spaceIf(false)
        .before(DjvTypes.PARENTHESIS_R).spaceIf(false)

