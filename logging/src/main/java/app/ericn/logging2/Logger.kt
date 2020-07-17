package app.ericn.logging2

import android.os.Build
import org.jetbrains.annotations.NonNls
import java.util.regex.Pattern

interface Logger {
    /** Log a verbose message with optional format args.  */
    fun v(message: String?, vararg args: Any?)

    /** Log a verbose exception and a message with optional format args.  */
    fun v(t: Throwable?, message: String?, vararg args: Any?)

    /** Log a verbose exception.  */
    fun v(t: Throwable?)

    /** Log a debug message with optional format args.  */
    fun d(message: String?, vararg args: Any?)

    /** Log a debug exception and a message with optional format args.  */
    fun d(t: Throwable?, message: String?, vararg args: Any?)

    /** Log a debug exception.  */
    fun d(t: Throwable?)

    /** Log an info message with optional format args.  */
    fun i(message: String?, vararg args: Any?)

    /** Log an info exception and a message with optional format args.  */
    fun i(t: Throwable?, message: String?, vararg args: Any?)

    /** Log an info exception.  */
    fun i(t: Throwable?)

    /** Log a warning message with optional format args.  */
    fun w(message: String?, vararg args: Any?)

    /** Log a warning exception and a message with optional format args.  */
    fun w(t: Throwable?, message: String?, vararg args: Any?)

    /** Log a warning exception.  */
    fun w(t: Throwable?)

    /** Log an error message with optional format args.  */
    fun e(message: String?, vararg args: Any?)

    /** Log an error exception and a message with optional format args.  */
    fun e(t: Throwable?, message: String?, vararg args: Any?)

    /** Log an error exception.  */
    fun e(t: Throwable?)

    /** Log an assert exception and a message with optional format args.  */
    fun wtf(@NonNls message: String?, vararg args: Any?)

    /** Log an assert exception.  */
    fun wtf(t: Throwable?, @NonNls message: String?, vararg args: Any?)

    /** Log at `priority` a message with optional format args.  */
    fun wtf(t: Throwable?)

    /** Log at `priority` a message with optional format args.  */
    fun log(priority: Int, message: String?, vararg args: Any?)

    /** Log at `priority` an exception and a message with optional format args.  */
    fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?)

    /** Log at `priority` an exception.  */
    fun log(priority: Int, t: Throwable?)

    fun getTag(): String? {
        val stackTrace = Throwable().stackTrace
        check(stackTrace.size > CALL_STACK_INDEX) { "Synthetic stacktrace didn't have enough elements: are you using proguard?" }
        return createStackElementTag(stackTrace[CALL_STACK_INDEX])
    }

    fun createStackElementTag(element: StackTraceElement): String? {
        var tag = element.className
        val m = ANONYMOUS_CLASS.matcher(tag)
        if (m.find()) {
            tag = m.replaceAll("")
        }
        tag = tag.substring(tag.lastIndexOf('.') + 1)
        // Tag length limit was removed in API 24.
        return if (tag.length <= MAX_TAG_LENGTH || Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tag
        } else tag.substring(0, MAX_TAG_LENGTH)
    }

    companion object {
        private const val MAX_LOG_LENGTH = 4000
        internal const val MAX_TAG_LENGTH = 23
        internal const val CALL_STACK_INDEX = 4
        internal val ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$")
    }
}