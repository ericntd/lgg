### Overview
The logging module allows you to plug and play and start logging with [Timber](https://github.com/JakeWharton/timber) in your modules easily.
More importantly, it gives you the flexibility to switch to another logging implementation with ease.

### Usage
1. Copy and paste the `logging` module into your project
2. Don't forget to add it to your `settings.gradle` and `app/build.gradle` (as a dependencies)
3. Set up the logger, for example
```kotlin
class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Logg.logger = TimberLogger
        }
    }
}
```
4. Use it similar to how you use Timber
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //...
        Logg.i("logg testing")
    }
}
```
outpus
```
2020-07-17 16:51:35.421 17997-17997/app.ericn.loggdemo I/MainActivity: logg testing
```
