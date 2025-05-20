package org.accenture.day01.lessons;

// A main class
public class Lesson01HelloWorld {
    /*
     * A special method signature that tells the JVM where to start the application.
     * Breakdown of 'public static void main(String[] args)':
     *
     * public     - Access modifier: means it can be called from outside the class
     * static     - Belongs to the class, not to instances (JVM can call it without creating an object)
     * void       - Return type: means this method does not return any value
     * main       - The name the JVM looks for as the entry point of the program
     * String[] args - An array of strings used to receive command-line arguments
     */
    public static void main(String[] args) {
        /*
         * System
         *   - A built-in Java class (utility class, non-instantiable on purpose)
         *   - Provides access to system-level features like printing messages and getting time
         *
         * out
         *   - A static PrintStream object inside the System class
         *
         * println
         *   - A method of the PrintStream class that prints the input to the console
         */
        System.out.println("Hello, world!");

        //TODO Start Here: Use addFiveToNumber method from Lesson02Methods class and print it

        //TODO: Use the method that returns two integers from Lesson02Methods and print it

        //TODO: Invoke printInstanceVariables() method from Lesson03VariablesAndDataTypes

        //TODO: Try to change the values here for HELLO_WORLD and FINAL_HELLO_WORLD variables that belongs in Lesson03VariablesAndDataTypes
    }
}
