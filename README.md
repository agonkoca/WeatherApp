# Weather App

Welcome to the **Weather App**! This project showcases a simple and efficient weather application built using Java and Android Studio. The app provides real-time weather updates, using the OpenWeather API, with an intuitive user interface for city-specific or location-based weather forecasts.

## Features
- Real-time weather updates for any city.
- Location-based weather using GPS.
- Hourly weather details (temperature, wind speed, condition icons).
- Scrollable list view with a responsive UI.

## Technologies Used
- **Java** for app logic.
- **Android SDK** for user interface and app lifecycle.
- **RecyclerView** for efficient data display.
- **OpenWeather API** for weather data.
- **Location Services** for GPS-based weather updates.

## Dependencies

The following libraries are included in the project to enhance functionality:

### 1. **Picasso**
- Used for efficient image loading and caching.
- Ideal for fetching and displaying weather icons.

### 2. **Volley**
- Used for handling HTTP requests and network operations.
- Ensures seamless and fast communication with weather APIs.

### 3. **Google Play Services: Location**
- Used to access the device's current location.
- Enables weather updates based on the user's real-time position.

### Implementation in `build.gradle`
The dependencies are added in the `build.gradle` file as:

```gradle
implementation 'com.squareup.picasso:picasso:2.8'
implementation 'com.android.volley:volley:1.2.1'
implementation 'com.google.android.gms:play-services-location:21.3.0'
```
## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/agonkoca/WeatherApp.git
   cd WeatherApp
2. Open the project in **Android Studio**.
3. Configure your API Key:
   - Register at OpenWeather to get an API key.
   - Add the API key to your project (e.g., in strings.xml).
4. Build and run the app on an emulator or device.

## Usage
1. Launch the app.
2. Use the search bar to search for a city's weather.
3. Enable location to get weather updates for your current position.
4. Scroll through the list to view hourly weather information.

