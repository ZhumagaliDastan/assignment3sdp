#Calculator

This is a simple calculator program that allows you to perform basic mathematical operations, such as addition, subtraction, multiplication, division, exponentiation, and calculating square roots. The program is implemented in Java and demonstrates the use of the Observer and Factory design patterns.
Features

    Perform addition (+), subtraction (-), multiplication (*), and division (/) operations.
    Calculate exponentiation using the "^" operator (e.g., 2 ^ 3 = 8).
    Calculate square roots using the "sqrt" command (e.g., sqrt 16 = 4).
    Implements the Observer pattern to observe and notify when the result changes.
    Utilizes the Factory pattern to create different types of calculators.

How to Run

    Clone the repository to your local machine.

    Compile the Java files:

    shell

javac *.java

Run the Main class:

shell

    java Main

    Follow the on-screen instructions to perform calculations. Enter an operation (+, -, *, /, ^, sqrt) and a value to see the result.

Usage

    Enter an operation (+, -, *, /) followed by a value (e.g., "+ 5" to add 5 to the current value).
    To calculate exponentiation, use the "^" operator (e.g., "^ 3" to raise the current value to the power of 3).
    To calculate the square root, use the "sqrt" command (e.g., "sqrt" to calculate the square root of the current value).
    Enter 'q' to quit the program.

Design Patterns

    Observer Pattern: The program implements the Observer pattern to observe changes in the calculator's result. The LoggingObserver and DisplayObserver classes are used to log and display the result when it changes.

    Factory Pattern: The program utilizes the Factory pattern to create different types of calculators. The CalculatorFactory interface and concrete factory classes (BasicCalculatorFactory and LoggingCalculatorFactory) demonstrate the Factory pattern.
