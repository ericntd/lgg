package app.ericn.loggdemo

import android.app.Application
import app.ericn.logging2.Lgg
import app.ericn.logging2.TimberLogger

class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Lgg.setUp(Lgg.Provider.TIMBER)
        }
    }
}