package org.accenture.day01.lessons;

public class Lesson03VariablesAndDataTypes {
    private int someInstanceVariableInteger; // Default value - 0
    private boolean someInstanceVariableBoolean; // Default value - false

    /*
     * final	    Makes a variable constant - can not change
     * static	    Makes it belong to the class instead of one object
     * static final	Used for constants shared across the whole program
    */
    public static String HELLO_WORLD = "Hello, World!";
    public static final String FINAL_HELLO_WORLD = "Hello, World!";

    private void printLocalInteger() {
        int someLocalInteger;
        //TODO What happens here? System.out.println(someLocalInteger);
    }
    public void printInstanceVariables() {
        //TODO: Print class integer and boolean in this class, in one line
    }

    // Some concepts around variables & data types
    public void playAroundWithVariablesAndDataTypes() {
        // Concept - Primitive data types
        // These are built-in types that store actual values directly unlike objects
        int someInteger = 5; // Stores a whole number (no decimals)
        double someDouble = 5.5; // Stores a decimal number

        // Concept - Reference data types
        // Store a reference (or pointer) to an object in memory, not the actual value.
        String someString = "Some String"; // Refers to a String object stored in memory
        someString.length(); // get length of someString
        "Some String".length(); // also get the length of "Some String"

        // Concept - Narrowing vs Widening conversions
        someDouble = someInteger; // this is fine
        //TODO someInteger = someDouble; // ?

        // Concept - Casting
        //TODO How to make someInteger = someDouble work ?

        // Concept - Immutable vs Mutable objects
        //TODO What is the value for the '?' symbol (debug / print to verify)
        String stringA = "String A"; // stringA = "String A"
        String stringB = stringA; // stringA = "String A", stringB = "String A"
        stringA = "String C"; // stringA = "String C", stringB = ?

        //TODO What is the value for the '?' symbol (debug / print to verify)
        Person personA = new Person("Alice"); // personA.getName() = "Alice"
        Person personB = personA; // personA.getName() = "Alice", personB.getName() = "Alice"
        personA.setName("Bob"); // personA.getName() = "Bob", personB.getName() = ?
    }
    public Lesson03VariablesAndDataTypes() {

    }

}
