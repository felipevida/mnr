# **MNR - Mars: Nasa Rovers**

## Overview
The MNR App is an Android application that fetches and displays photos taken by NASA's Mars rovers.

## NASA API
The app integrates with the [NASA Mars Rover Photos API](https://github.com/corincerami/mars-photo-api) to fetch the latest photos taken by the Mars rovers.

## Features
+ Browse Mars photos by selecting a rover and a specific Martian Sol.
+ Randomize the Martian Sol to explore different days.
+ Display photo details such as the photo ID, Sol, and the rover name.
+ Save favourite photos locally for later access.

## Libraries Used

+ **[Jetpack Compose](https://developer.android.com/compose):**
  Used for building the app's UI in a declarative way, allowing for flexible and reactive interfaces.

+ **[Retrofit](https://square.github.io/retrofit/):**
  Handles HTTP requests to fetch Mars rover photos from NASA's API.

+ **[Coil](https://coil-kt.github.io/coil/):**
  Used for asynchronous image loading and displaying images in the app.

+ **[Dagger](https://developer.android.com/training/dependency-injection/dagger-basics) \ [Hilt](https://developer.android.com/codelabs/android-hilt#0):**
  Provides dependency injection (DI) for managing and injecting dependencies like the MNRPhotoService.

+ **[Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html):**
  Manages asynchronous tasks such as network requests, ensuring a smooth and responsive user experience.

+ **[Kotlin Flow](https://developer.android.com/kotlin/flow) \ [StateFlow](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow):**
  Handles state management within the ViewModel for efficiently tracking and updating the app's UI state.

+ **[Kotlin Symbol Processing (KSP)](https://developer.android.com/build/migrate-to-ksp):**
  KSP is a tool used to generate code at compile time, helping to improve app performance and reduce boilerplate code.
  In this app, it is integrated with Room and Dagger Hilt to simplify database schema generation and dependency injection.

+ **[Room - SQLite](https://developer.android.com/jetpack/androidx/releases/room):**
  A persistence library used to store and manage data locally in the app. Room abstracts SQLite, allowing for seamless database operations. It is used in conjunction with KSP for efficient database schema generation.

