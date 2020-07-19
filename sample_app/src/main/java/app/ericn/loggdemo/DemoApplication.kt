package app.ericn.loggdemo

import android.app.Application
import app.ericn.logging2.Logg
import app.ericn.logging2.TimberLogger

class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
//            Logg.logger = TimberLogger
        }
    }
}