# Weather App

Welcome to the **Weather App**! This project showcases a simple and efficient weather application built using Java and Android Studio.

## Version Control Guidelines

### Cloning the Repository
To clone the repository, run the following command in your terminal:
```git clone https://github.com/yourusername/your-repo.git```

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
implementation libs.picasso
implementation libs.volley
implementation libs.play.services.location
```
