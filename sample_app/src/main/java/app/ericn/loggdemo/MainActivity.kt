package app.ericn.loggdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ericn.logging2.Lgg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Lgg.i("logg testing")
    }
}