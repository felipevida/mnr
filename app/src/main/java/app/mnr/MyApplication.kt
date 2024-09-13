package app.mnr

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MyApplication : Application() {
    // This class will serve as the base application class for Hilt
}
