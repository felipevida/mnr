# **MNR - Mars: NASA Rovers**

## Overview
The MNR App is an Android application that fetches and displays photos taken by NASA's Mars rovers.

## NASA API
The app integrates with the [NASA Mars Rover Photos API](https://github.com/corincerami/mars-photo-api) to fetch the latest photos taken by the Mars rovers.

## Features
- Browse Mars photos by selecting a rover and a specific Martian Sol.
- Randomize the Martian Sol to explore different days.
- Display photo details such as the photo ID, Sol, and the rover name.
- Save favorite photos locally for later access.

## Libraries and Dependencies

### Jetpack Compose
- **[Jetpack Compose](https://developer.android.com/compose)**:  
  Used for building the app's UI in a declarative way, allowing for flexible and reactive interfaces.
  - `androidx.compose.ui:ui:1.5.1`
  - `androidx.compose.material:material:1.7.1`
  - `androidx.compose.ui:ui-tooling-preview:1.7.1`
  - `androidx.compose:compose-bom:2024.09.00`
  - `androidx.compose.runtime:runtime-livedata:1.7.1`

### Core Libraries
- **[Kotlin](https://kotlinlang.org)**:  
  Provides modern language features for building the app.  
  - `org.jetbrains.kotlin:kotlin-stdlib:1.9.10`
  
- **[AndroidX Core KTX](https://developer.android.com/kotlin/ktx)**:  
  Extensions for concise Kotlin syntax.  
  - `androidx.core:core-ktx:1.13.1`

- **[Material Components](https://material.io/develop/android)**:  
  Implements Material Design components.  
  - `com.google.android.material:material:1.12.0`

### Dependency Injection
- **[Dagger Hilt](https://dagger.dev/hilt/)**:  
  Provides dependency injection for managing and injecting dependencies.
  - `com.google.dagger:hilt-android:2.48.1`
  - `androidx.hilt:hilt-navigation-compose:1.2.0`
  - `com.google.dagger:hilt-android-compiler:2.48.1`

### Networking
- **[Retrofit](https://square.github.io/retrofit/)**:  
  Handles HTTP requests to fetch Mars rover photos from NASA's API.
  - `com.squareup.retrofit2:retrofit:2.11.0`
  - `com.squareup.retrofit2:converter-gson:2.11.0`

### Image Loading
- **[Coil](https://coil-kt.github.io/coil/)**:  
  Used for asynchronous image loading and displaying images in the app.
  - `io.coil-kt:coil-compose:2.7.0`
  - `io.coil-kt:coil-svg:2.2.2`

### Local Storage
- **[Room](https://developer.android.com/jetpack/androidx/releases/room)**:  
  A persistence library used to store and manage data locally in the app.  
  - `androidx.room:room-runtime:2.6.0`
  - `androidx.room:room-compiler:2.6.0`

### Coroutines and State Management
- **[Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)**:  
  Manages asynchronous tasks such as network requests, ensuring a smooth and responsive user experience.
  - `org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3`
  
- **[StateFlow](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow)**:  
  Handles state management within the ViewModel for efficiently tracking and updating the app's UI state.

### Testing
- **[JUnit](https://junit.org/junit5/)**:  
  A widely used testing framework.  
  - `org.jetbrains.kotlin:kotlin-test:1.9.10`

- **[Mockito](https://site.mockito.org/)**:  
  Used for mocking during unit tests.
  - `org.mockito:mockito-core:5.13.0`
  - `org.mockito:mockito-inline:5.2.0`
  - `org.mockito.kotlin:mockito-kotlin:5.0.0`

- **[Turbine](https://github.com/cashapp/turbine)**:  
  Used for testing Kotlin Flow.
  - `app.cash.turbine:turbine:1.0.0`

### Build Tools
- **[Kotlin Symbol Processing (KSP)](https://developer.android.com/build/migrate-to-ksp)**:  
  A tool used to generate code at compile time, helping to improve app performance and reduce boilerplate code.  
  Integrated with Room and Dagger Hilt.
  - `com.google.devtools.ksp:symbol-processing-api:1.9.10-1.0.13`

### Navigation
- **[Jetpack Navigation Compose](https://developer.android.com/jetpack/compose/navigation)**:  
  Handles navigation within the app using Jetpack Compose.
  - `androidx.navigation:navigation-compose:2.8.0`
