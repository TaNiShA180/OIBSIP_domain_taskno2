# Guess the Number Game

A fun and interactive Java-based number guessing game where players try to guess a randomly generated number within a limited number of attempts across multiple rounds.

## Objective

The main objective of this project is to create an engaging number guessing game that:
- Generates random numbers for players to guess
- Provides interactive feedback to guide players
- Implements a scoring system based on performance
- Offers multiple rounds of gameplay
- Limits attempts to add challenge and excitement

## Game Features

- **Random Number Generation**: Computer generates numbers between 1-100
- **Interactive GUI**: User-friendly dialog boxes for input and feedback
- **Smart Feedback System**: Tells players if their guess is too high, too low, or correct
- **Limited Attempts**: Maximum 10 attempts per round to add challenge
- **Multiple Rounds**: 5 rounds of gameplay for extended fun
- **Scoring System**: Points awarded based on efficiency (fewer attempts = more points)
- **Input Validation**: Handles invalid inputs gracefully
- **Game Statistics**: Displays total score at the end
## Game Rules

-Objective: Guess the randomly generated number between 1-100
-Attempts: Maximum 10 attempts per round
-Rounds: Total of 5 rounds
-Scoring: Points awarded based on efficiency
        Guess in 1 attempt = 10 points
        Guess in 2 attempts = 9 points
        And so on...
-Feedback: Game provides hints if guess is too high or too low
-Validation: Only numbers between 1-100 are accepted


## Steps Performed

### 1. Game Initialization
- Set up constants for maximum attempts (10) and rounds (5)
- Initialize total score counter

### 2. Round Management
- Loop through 5 rounds of gameplay
- Display round information to the player
- Generate a new random number (1-100) for each round

### 3. Guess Processing
- Prompt user for number input via dialog box
- Validate input (numeric and within range)
- Compare guess with target number
- Provide appropriate feedback (higher/lower/correct)
- Track number of attempts

### 4. Scoring System
- Calculate points based on attempts taken
- Formula: `Points = MAX_ATTEMPTS - attempts + 1`
- Add round points to total score

### 5. Game Completion
- Display final total score
- End game after all rounds completed

## Tools and Technologies Used

### Programming Language
- **Java**: Core programming language for game logic

### Libraries and Frameworks
- **javax.swing.JOptionPane**: For creating interactive dialog boxes and GUI elements
- **java.util.Random**: For generating random numbers
- **Standard Java Libraries**: For basic operations and exception handling

### Development Environment
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or text editor
- Java Development Kit (JDK) 8 or higher
- Command line tools for compilation and execution

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed
- Java IDE or command line access

### Compilation and Execution
```bash
## Compile the Java file
javac GuessTheNumber.java

# Run the program
java GuessTheNumber
```

## Outcome and Benefits

### Technical Achievements
- Successfully implemented random number generation
- Created interactive GUI using Swing components
- Implemented robust input validation and error handling
- Developed a fair and engaging scoring system
- Created modular and maintainable code structure

### Learning Outcomes
-Programming Logic: Enhanced understanding of loops, conditionals, and methods
-GUI Development: Experience with Java Swing for user interfaces
-Error Handling: Implementation of try-catch blocks for input validation
-Game Design: Understanding of user experience and game flow
-Object-Oriented Programming: Use of static methods and constants

### Game Experience
-Engaging Gameplay: Multiple rounds keep players interested
-Progressive Difficulty: Limited attempts add strategic thinking
-Immediate Feedback: Players learn and improve with each guess
-Competitive Element: Scoring system encourages efficiency
-User -Friendly: Simple interface accessible to all skill levels

### Future Enhancements
-Add difficulty levels (different number ranges)
-Implement high score persistence
-Add timer-based challenges
-Create multiplayer functionality
-Enhance GUI with custom graphics
-Add sound effects and animations
