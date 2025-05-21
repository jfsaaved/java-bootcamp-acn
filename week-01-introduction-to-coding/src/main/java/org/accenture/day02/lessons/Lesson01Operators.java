package org.accenture.day02.lessons;

public class Lesson01Operators {

    /*
     * Access Modifiers in Java
     * -------------------------
     *
     * public    → Accessible from anywhere.
     * protected → Accessible within the same package and by subclasses (even in other packages).
     * default   → Accessible only within the same package (no modifier used).
     * private   → Accessible only within the same class.
     *
     * Access Level (Highest to Lowest):
     * public > protected > default > private
     */

    // Review questions
    int a, b;

    // TODO: Write a method that initialize two integer variables and prints their sum.

    // TODO: Write a method called `greetUser` that takes a String name as a parameter and returns "Hello, [name]!"

    // Relational Operator Exercises
    // TODO: Write a method called 'equalValue' that returns true if two integer parameters are equal

    // TODO: Write a method called 'notEqualValue' that returns true if two integer parameters are NOT equal

    // TODO: Write a method `isPositive` that returns true if a number is greater than 0, false otherwise.

    // Logical Operator Exercises
    // TODO: Write a method called 'bothPositive' that takes two integers as parameters
    //  and returns true only if BOTH numbers are greater than 0 using the && operator.

    // Unary Operators
    // TODO: Write a method that increments an integer parameter once and print the before and after values.

    // TODO: Implement a method that returns first then increments a parameter integer, and print the before and after

    // TODO What happens here?
    public void equalsVsEquals() {
        String a = new String("hello");
        String b = new String("hello");
        //String a = "hello";
        //String b = "hello";

        System.out.println("a == b: " + (a == b));           // false
        System.out.println("a.equals(b): " + a.equals(b));
    }
    public Lesson01Operators() {
        a = 10;
        b = 5;

        // Arithmetic Operators
        int sum = a + b;           // Addition
        int difference = a - b;    // Subtraction
        int product = a * b;       // Multiplication
        int quotient = a / b;      // Division
        int remainder = a % b;     // Modulo

        //  Relational (Comparison) Operators
        boolean isEqual = a == b;        // Equal to
        boolean isNotEqual = a != b;     // Not equal to
        boolean isGreater = a > b;       // Greater than
        boolean isLess = a < b;          // Less than
        boolean isGreaterOrEqual = a >= b; // Greater than or equal to
        boolean isLessOrEqual = a <= b;    // Less than or equal to

        // Logical Operators
        boolean result1 = (a > 0) && (b > 0);   // Logical AND
        boolean result2 = (a > 0) || (b < 0);   // Logical OR
        boolean result3 = !(a == b);           // Logical NOT

        // Assignment Operators
        int x = a;        // Simple assignment
        x += b;           // x = x + b
        x -= b;           // x = x - b
        x *= b;           // x = x * b
        x /= b;           // x = x / b
        x %= b;           // x = x % b

        // Unary Operators
        int tickingTimeBomb = 5;
        tickingTimeBomb++; // tickingTimeBomb = 6
        tickingTimeBomb++; // tickingTimeBomb = 7

        int preIncrement = ++tickingTimeBomb;  // Increments first, then returns (6)
        int postIncrement = tickingTimeBomb++; // Returns first, then increments (6, then value becomes 7)

        int preDecrement = --tickingTimeBomb;  // Decrements first, then returns
        int postDecrement = tickingTimeBomb--; // Returns first, then decrements

        int negative = -a;           // Negation
        int positive = +b;           // Unary plus (usually has no effect)

        System.out.println("Lesson01Operators loaded.");
    }

}
