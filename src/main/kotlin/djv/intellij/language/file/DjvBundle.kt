package djv.intellij.language.file

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey
import djv.intellij.language.DjvLanguage.Bundle
import java.util.function.Supplier

object DjvBundle : DynamicBundle(Bundle) {
    fun message(@PropertyKey(resourceBundle = Bundle) key: String, vararg params: Any): String {
        return getMessage(key, *params)
    }

    fun messagePointer(@PropertyKey(resourceBundle = Bundle) key: String, vararg params: Any): Supplier<String> {
        return getLazyMessage(key, *params)
    }
}