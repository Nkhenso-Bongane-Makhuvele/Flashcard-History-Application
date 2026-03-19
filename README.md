# Flashcard Study App (Kotlin – Android Studio)

## Author

Nkhenso Bongane Duma

---

## GitHub Repository

https://github.com/Nkhenso-Bongane-Makhuvele/Flashcard-History-Application

---

## Project Overview

The Flashcard Study App is a native Android application developed using Kotlin in Android Studio. The purpose of this application is to assist users in studying history through an interactive flashcard-based quiz system.

The app presents a series of True/False questions, evaluates user responses in real time, and provides immediate feedback. At the end of the quiz, the user receives a score along with personalised feedback and the option to review all questions and correct answers.

This application demonstrates fundamental Android development concepts such as activity navigation, user interaction handling, data structures, and state management.

---

## Objectives

The main objectives of this project are:

* To design and develop a functional Android application using Kotlin
* To implement a flashcard-based quiz system
* To utilise arrays and loops for managing questions and answers
* To provide real-time feedback and scoring
* To apply version control using GitHub
* To integrate GitHub Actions for continuous integration

---

## Features and Functionality

### 1. Welcome Screen

* Displays a welcome message and app description
* Includes a Start Button to begin the quiz
* Navigates to the quiz screen using an Intent

---

### 2. Flashcard Quiz Screen

* Displays one question at a time
* Provides two answer options: True or False
* Includes a Next Button to move through questions
* Shows immediate feedback:

  * "Correct!" if the answer is right
  * "Incorrect" if the answer is wrong
* Tracks user score dynamically

---

### 3. Score Screen

* Displays final score (e.g., 3/5)
* Provides personalised feedback:

  * "Great job!" for scores ≥ 3
  * "Keep practising!" for scores < 3
* Includes:

  * Review Button to view all questions and correct answers
  * Exit Button to close the application

---

### 4. Review Screen

* Displays all questions with their correct answers
* Allows users to revise and reinforce learning

---

## Application Logic

### Data Structures

Two parallel arrays are used:

* Questions Array stores all quiz questions
* Answers Array stores corresponding True/False answers

This ensures a direct relationship between each question and its correct answer.

---

### Control Flow

* An index-based approach is used to iterate through the questions
* The current question index is updated after each response
* The score is incremented only when the answer is correct

---

### Scoring System

* Each correct answer is worth one mark
* Total score is calculated out of five
* Final feedback is generated based on performance

---

## System Architecture

The app follows a multi-activity architecture:

* MainActivity serves as the entry point (Welcome Screen)
* QuizActivity handles quiz logic and user interaction
* ScoreActivity displays results and feedback
* ReviewActivity displays correct answers

---

## Navigation Flow

Welcome Screen → Quiz Screen → Score Screen → Review Screen

Navigation is implemented using Android Intents.

---

## Code Implementation Details

### Logging

Logging is implemented using:

```kotlin
Log.d("ActivityName", "Message")
```

This is used to track application flow, user interactions, and score updates.

---

### Comments

The code includes my comments to improve readability and demonstrate my understanding of the implemented logic.

---

## UI and Design Considerations

* A clean and simple layout was used to enhance usability
* Minimal distractions allow users to focus on the quiz
* Text is clearly readable for accessibility
* Feedback messages are concise and informative
* Navigation between screens is intuitive

---

## Testing and Validation

The application was tested to ensure:

* All buttons function correctly
* Score updates accurately
* Navigation between screens works as expected
* The application runs without crashes

---

## Version Control (GitHub)

GitHub was used to manage the development process.

Key practices include:

* Regular commits after implementing features
* Meaningful commit messages
* Pushing code to a remote repository for backup and tracking

---

## GitHub Actions (CI/CD)

GitHub Actions was used to automate the build process.

The workflow includes:

* Automatic builds on push to the main branch
* Java environment setup
* Gradle build execution

This ensures that the project builds successfully and maintains code quality.

---

## Screenshots

Screenshots of the following screens:

* Welcome Screen
  <img width="312" height="592" alt="image" src="https://github.com/user-attachments/assets/89575f84-b620-42a9-b2a0-eb6e4f104571" />

* Quiz Screen
  <img width="340" height="576" alt="image" src="https://github.com/user-attachments/assets/680d8c3b-156b-43f5-aaf8-82744f5a6276" />

* Score Screen
<img width="341" height="587" alt="image" src="https://github.com/user-attachments/assets/5b902555-1103-40dc-8ae5-2376402c3b4b" />

* Review Screen
  <img width="330" height="586" alt="image" src="https://github.com/user-attachments/assets/c0607e62-3339-4194-9c3d-d312b33a8ae5" />


---

## Challenges and Solutions

Challenge 1: Managing question progression
Solution: Implemented an index-based system to track the current question

Challenge 2: Passing data between activities
Solution: Used Intent extras to transfer score, questions, and answers

Challenge 3: Maintaining application state
Solution: Stored score and index variables within activity lifecycle

---

## Learning Outcomes

This project contributed to the development of the following skills:

* Android development using Kotlin
* UI design using XML layouts
* Activity lifecycle understanding
* Use of arrays and control structures
* Debugging using Logcat
* Version control with GitHub
* Continuous integration using GitHub Actions

---

## Conclusion

The Flashcard Study App successfully meets all the project requirements by providing an interactive and educational experience. The project demonstrates a solid understanding of Android development principles, structured programming, and effective use of development tools.

---

## References

Android Developers. 2025. Activities and Intents. [Online] Available at: https://developer.android.com

Kotlin Documentation. 2025. Kotlin Language Guide. [Online] Available at: https://kotlinlang.org

GitHub. 2025. GitHub Actions Documentation. [Online] Available at: https://docs.github.com

---
