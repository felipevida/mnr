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

+ **Jetpack Compose,**
  Used for building the app's UI in a declarative way, allowing for flexible and reactive interfaces.

+ **Retrofit**
  Handles HTTP requests to fetch Mars rover photos from NASA's API.

+ **Coil**
  Used for asynchronous image loading and displaying images in the app.

+ **Dagger Hilt**
  Provides dependency injection for managing and injecting dependencies like the MNRPhotoService.

+ **Kotlin Coroutines**
  Manages asynchronous tasks such as network requests, ensuring a smooth and responsive user experience.

+ **Kotlin StateFlow**
  Handles state management within the ViewModel for efficiently tracking and updating the app's UI state.
