# Firebase Cloud Storage Image Uploader

This application allows users to upload images with captions to Firebase Cloud Storage and store the image metadata in Firebase Realtime Database. The uploaded images can be viewed in a grid layout on the main screen along with their respective captions. Users can also add new images by navigating to the upload screen.

## Features
* Upload images from the device's gallery with captions.
* Display uploaded images and their captions in a grid layout on the main screen.
* Store image metadata (image URI and caption) in Firebase Realtime Database.
* Store uploaded images in Firebase Cloud Storage.

## Prerequisites
Before running the application, ensure that you have the following:
1. Android Studio installed on your machine.
2. A Firebase project set up with Firebase Realtime Database and Firebase Cloud Storage.

## Usage
1. Launch the application on your device/emulator.
2. The main screen (MainActivity) will display the uploaded images in a grid layout along with their captions.
3. To add a new image, tap the floating action button (+) on the main screen to navigate to the upload screen (UploadActivity).
4. On the upload screen, tap the image view to select an image from the device's gallery using the activity result launcher and implicit intent.
5. Enter a caption for the selected image in the caption edit text.
6. Tap the "Upload" button to upload the image and its caption to Firebase Realtime Database and Firebase Cloud Storage.
7. After a successful upload, you will be redirected to the main screen, where the newly uploaded image will be displayed along with the existing images.

## Dependencies
The project uses the following dependencies:
1. Firebase Realtime Database: To store image metadata (image URI and caption).
2. Firebase Cloud Storage: To store the uploaded images.
3. Glide: For image loading and caching.
4. Material Design Components: For UI components and styling.

**You can find the specific dependencies and their versions in the build.gradle file.**

## Troubleshooting
If you encounter any issues or errors while running the application, please ensure that:

* Your Firebase project is properly set up and configured.
* You have the necessary permissions and dependencies in your AndroidManifest.xml file.
* You have a stable internet connection to access Firebase services.

## Screenshots
1. MainActivity
   * ![image](https://github.com/SaraSAli/FirebaseCloudStorage/assets/17590461/5fda1940-f01b-4d55-9fb2-31869f3648fd)
2. UploadActivity
   * ![image](https://github.com/SaraSAli/FirebaseCloudStorage/assets/17590461/7cd65086-69ad-452f-805f-71f2bfe68311)

Happy coding!
