# Task-1-Syed-Nazre-Abbas
# Number Guessing Game (DecodeLabs_Java_P1)

## Project Overview

This project implements a classic Number Guessing Game in Java. The program generates a random number within a specified range (1 to 100) and challenges the user to guess it. It provides interactive feedback, guiding the user whether their guess is too high or too low, and continues until the correct number is identified.

## Features

*   **Random Number Generation**: Utilizes Java's `Random` class to generate a secret number between 1 and 100.
*   **User Input Handling**: Employs the `Scanner` class to efficiently capture user guesses.
*   **Interactive Feedback**: Informs the user if their guess is 
too high or too low.
*   **Looping Mechanism**: Continues the guessing process until the correct number is found.
*   **Limited Attempts**: Each round provides a fixed number of attempts (7 attempts per round).
*   **Multiple Rounds**: Players can choose to play multiple rounds consecutively.
*   **Scoring System**: Awards points based on the number of attempts remaining when the correct guess is made, encouraging efficient guessing.
*   **Input Validation**: Handles non-integer inputs gracefully, prompting the user to enter a valid number.

## How to Play

1.  The game will generate a random number between 1 and 100.
2.  You will have 7 attempts to guess the number.
3.  Enter your guess when prompted.
4.  The game will tell you if your guess is "Too high!" or "Too low!".
5.  If you guess correctly, you earn points based on remaining attempts.
6.  After each round, you will be asked if you wish to play again.
7.  At the end, your total score and rounds played will be displayed.

## Key Concepts Demonstrated

*   **`java.util.Random`**: For generating pseudo-random numbers.
*   **`java.util.Scanner`**: For handling user input from the console.
*   **Loops (`while`)**: To control the game flow for guessing attempts and multiple rounds.
*   **Conditional Statements (`if-else if-else`)**: For providing feedback on guesses and determining game logic.
*   **Variables**: To store game state such as the target number, user guess, attempts left, and score.
*   **Basic Input Validation**: To ensure robust handling of user input.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 8 or higher installed on your system.

### Running the Game

1.  **Save the file**: Save the provided Java code as `DecodeLabs_Java_P1.java`.
2.  **Compile**: Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac DecodeLabs_Java_P1.java
    ```
3.  **Run**: After successful compilation, run the game using the Java Virtual Machine:
    ```bash
    java DecodeLabs_Java_P1
    ```

Follow the on-screen prompts to play the game.


