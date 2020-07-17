package app.ericn.logging2

import org.jetbrains.annotations.NonNls
import timber.log.Timber

object TimberLogger : Logger {
    init {
        Timber.plant(Timber.DebugTree())
    }

    /** Log a verbose message with optional format args.  */
    override fun v(message: String?, vararg args: Any?) {
        Timber.tag(getTag()).v(message, *args)
    }

    /** Log a verbose exception and a message with optional format args.  */
    override fun v(t: Throwable?, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).v(t, message, *args)
    }

    /** Log a verbose exception.  */
    override fun v(t: Throwable?) {
        Timber.tag(getTag()).v(t)
    }

    /** Log a debug message with optional format args.  */
    override fun d(message: String?, vararg args: Any?) {
        Timber.tag(getTag()).d(message, *args)
    }

    /** Log a debug exception and a message with optional format args.  */
    override fun d(t: Throwable?, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).d(t, message, *args)
    }

    /** Log a debug exception.  */
    override fun d(t: Throwable?) {
        Timber.tag(getTag()).d(t)
    }

    /** Log an info message with optional format args.  */
    override fun i(message: String?, vararg args: Any?) {
        Timber.tag(getTag()).i(message, *args)
    }

    /** Log an info exception and a message with optional format args.  */
    override fun i(t: Throwable?, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).i(t, message, *args)
    }

    /** Log an info exception.  */
    override fun i(t: Throwable?) {
        Timber.tag(getTag()).i(t)
    }

    /** Log a warning message with optional format args.  */
    override fun w(message: String?, vararg args: Any?) {
        Timber.tag(getTag()).w(message, *args)
    }

    /** Log a warning exception and a message with optional format args.  */
    override fun w(t: Throwable?, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).w(t, message, *args)
    }

    /** Log a warning exception.  */
    override fun w(t: Throwable?) {
        Timber.tag(getTag()).w(t)
    }

    /** Log an error message with optional format args.  */
    override fun e(message: String?, vararg args: Any?) {
        Timber.tag(getTag()).e(message, *args)
    }

    /** Log an error exception and a message with optional format args.  */
    override fun e(t: Throwable?, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).e(t, message, *args)
    }

    /** Log an error exception.  */
    override fun e(t: Throwable?) {
        Timber.tag(getTag()).e(t)
    }

    /** Log an assert message with optional format args.  */
    override fun wtf(@NonNls message: String?, vararg args: Any?) {
        Timber.tag(getTag()).wtf(message, *args)
    }

    /** Log an assert exception and a message with optional format args.  */
    override fun wtf(t: Throwable?, @NonNls message: String?, vararg args: Any?) {
        Timber.tag(getTag()).wtf(t, message, *args)
    }

    /** Log an assert exception.  */
    override fun wtf(t: Throwable?) {
        Timber.tag(getTag()).wtf(t)
    }

    /** Log at `priority` a message with optional format args.  */
    override fun log(priority: Int, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).log(priority, message, *args)
    }

    /** Log at `priority` an exception and a message with optional format args.  */
    override fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?) {
        Timber.tag(getTag()).log(priority, t, message, *args)
    }

    /** Log at `priority` an exception.  */
    override fun log(priority: Int, t: Throwable?) {
        Timber.tag(getTag()).log(priority, t)
    }
}