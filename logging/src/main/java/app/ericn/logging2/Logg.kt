package app.ericn.logging2

object Logg : Logger {
    lateinit var logger: Logger

    override fun v(message: String?, vararg args: Any?) {
        logger.v(message, *args)
    }

    override fun v(t: Throwable?, message: String?, vararg args: Any?) {
        logger.v(t, message, *args)
    }

    override fun v(t: Throwable?) {
        logger.v(t)
    }

    override fun d(message: String?, vararg args: Any?) {
        logger.d(message, *args)
    }

    override fun d(t: Throwable?, message: String?, vararg args: Any?) {
        logger.d(t, message, *args)
    }

    override fun d(t: Throwable?) {
        logger.d(t)
    }

    override fun i(message: String?, vararg args: Any?) {
        logger.i(message, *args)
    }

    override fun i(t: Throwable?, message: String?, vararg args: Any?) {
        logger.i(t, message, *args)
    }

    override fun i(t: Throwable?) {
        logger.i(t)
    }

    override fun w(message: String?, vararg args: Any?) {
        logger.w(message, *args)
    }

    override fun w(t: Throwable?, message: String?, vararg args: Any?) {
        logger.w(t, message, *args)
    }

    override fun w(t: Throwable?) {
        logger.w(t)
    }

    override fun e(message: String?, vararg args: Any?) {
        logger.e(message, *args)
    }

    override fun e(t: Throwable?, message: String?, vararg args: Any?) {
        logger.e(t, message, *args)
    }

    override fun e(t: Throwable?) {
        logger.e(t)
    }

    override fun wtf(message: String?, vararg args: Any?) {
        logger.wtf(message, *args)
    }

    override fun wtf(t: Throwable?, message: String?, vararg args: Any?) {
        logger.wtf(t, message, *args)
    }

    override fun wtf(t: Throwable?) {
        logger.wtf(t)
    }

    override fun log(priority: Int, message: String?, vararg args: Any?) {
        logger.log(priority, message, *args)
    }

    override fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?) {
        logger.log(priority, t, message, *args)
    }

    override fun log(priority: Int, t: Throwable?) {
        logger.log(priority, t)
    }
}