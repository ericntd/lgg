### Overview
The logging module allows you to plug and play and start logging with [Timber](https://github.com/JakeWharton/timber) in your modules easily.
More importantly, it gives you the flexibility to switch to another logging implementation with ease.

### Usage
1. Copy and paste the `logging` module into your project
2. Don't forget to add it to your `settings.gradle` and `app/build.gradle` (as a dependencies)
3. 2 approaches

**Approach #1 Decorator pattern - Logg.kt**

Set it up
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
and use it similar to how you use Timber
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //...
        Logg.i("logg testing")
    }
}
```
outputs
```
2020-07-17 16:51:35.421 17997-17997/app.ericn.loggdemo I/MainActivity: logg testing
```
**Approach #2 - Use dependency injection with Dagger for example**

Provision
```kotlin
@Module
class LoggingModule {
    @Singleton
    @Provides
    fun provideLogger() : Logger {
        return TimberLogger
    }
}
```
Consumption
```kotlin
class MainActivity : AppCompatActivity() {
    @Inject lateinit var logger: Logger
    override fun onCreate(savedInstanceState: Bundle?) {
        //...
        logger.i("logg testing")
    }
}
```
