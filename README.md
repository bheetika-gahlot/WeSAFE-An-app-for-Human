# WeSafe – Human Safety Android App 🚨🛡️

WeSafe is an Android application designed to enhance personal safety through smart features like real-time location tracking, emergency alerts, contact management, and camera access. The app is especially focused on women's safety and general emergency responsiveness.

---

## 📱 Features

- 🔐 **Firebase Authentication**  
  Secure login using Firebase Auth with user profile sync.

- 📍 **Live Location Access**  
  Retrieves precise location using GPS (with user permission).

- 📸 **Instant Camera Access**  
  Captures images directly via the device camera when needed.

- 📇 **Emergency Contact Access**  
  Reads and displays user contacts for alert and communication features.

- 🌐 **Firebase Firestore Integration**  
  Saves and syncs user profile data (name, email, phone, image) to Firestore.

- 🧭 **Bottom Navigation**  
  Easy navigation across Home, Guard, Dashboard (Maps), and Profile.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **Architecture:** MVVM 
- **UI Framework:** Jetpack, ViewBinding
- **Backend:** Firebase Auth + Firestore
- **Permissions:** Runtime Permission Handling for Location, Camera, and Contacts

---

## 🔐 Required Permissions

The app requests the following permissions at runtime:

- `ACCESS_FINE_LOCATION` – to track user's current location
- `CAMERA` – to capture images in emergency
- `READ_CONTACTS` – to access and manage emergency contacts

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/wesafe-humansafety.git

## Project Structure
com.example.wesafe_humansafety/
│
├── MainActivity.kt
├── fragments/
│   ├── HomeFragment.kt
│   ├── GuardFragment.kt
│   ├── MapsFragment.kt
│   └── ProfileFragment.kt
├── res/
│   ├── layout/
│   └── drawable/
├── AndroidManifest.xml
└── build.gradle
