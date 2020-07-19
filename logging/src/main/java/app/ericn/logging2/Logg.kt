package app.ericn.logging2

import android.annotation.SuppressLint
import android.util.Log

object Logg : Logger {
    var logger: Logger? = null

    override fun v(message: String?, vararg args: Any?) {
        validateLogger()
        logger?.v(message, *args)
    }

    override fun v(t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.v(t, message, *args)
    }

    override fun v(t: Throwable?) {
        validateLogger()
        logger?.v(t)
    }

    override fun d(message: String?, vararg args: Any?) {
        validateLogger()
        logger?.d(message, *args)
    }

    override fun d(t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.d(t, message, *args)
    }

    override fun d(t: Throwable?) {
        validateLogger()
        logger?.d(t)
    }

    override fun i(message: String?, vararg args: Any?) {
        validateLogger()
        logger?.i(message, *args)
    }

    override fun i(t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.i(t, message, *args)
    }

    override fun i(t: Throwable?) {
        validateLogger()
        logger?.i(t)
    }

    override fun w(message: String?, vararg args: Any?) {
        validateLogger()
        logger?.w(message, *args)
    }

    override fun w(t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.w(t, message, *args)
    }

    override fun w(t: Throwable?) {
        validateLogger()
        logger?.w(t)
    }

    override fun e(message: String?, vararg args: Any?) {
        validateLogger()
        logger?.e(message, *args)
    }

    override fun e(t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.e(t, message, *args)
    }

    override fun e(t: Throwable?) {
        validateLogger()
        logger?.e(t)
    }

    override fun wtf(message: String?, vararg args: Any?) {
        validateLogger()
        logger?.wtf(message, *args)
    }

    override fun wtf(t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.wtf(t, message, *args)
    }

    override fun wtf(t: Throwable?) {
        validateLogger()
        logger?.wtf(t)
    }

    override fun log(priority: Int, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.log(priority, message, *args)
    }

    override fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?) {
        validateLogger()
        logger?.log(priority, t, message, *args)
    }

    override fun log(priority: Int, t: Throwable?) {
        validateLogger()
        logger?.log(priority, t)
    }

    @SuppressLint("LogNotTimber")
    private fun validateLogger() {
        if (logger == null) {
            Log.w("Logg", "logger not set, logging will not work")
        }
    }
}