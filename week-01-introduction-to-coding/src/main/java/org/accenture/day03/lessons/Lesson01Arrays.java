package org.accenture.day03.lessons;

public class Lesson01Arrays {

    // TODO: Declare an int array of size 5 and assign values from 1 to 5

    // TODO: Print all elements of a String[] containing {"apple", "banana", "cherry"}

    // TODO: Access and print the third element of an array

    // TODO: Change the second element of a double[] from 0.0 to 3.14

    // TODO: Print the length of an array using .length

    // TODO: Explore == vs equals, and value changes

    public Lesson01Arrays() {
        int[] numbers;           // declaration
        numbers = new int[5];    // allocation (5 integers: 0 0 0 0 0)
        int[] otherNumbers = new int[5]; // single-line declaration

        int[] scores = {90, 85, 88, 70, 95}; // initialized
        String[] names = new String[3];  // all null

        scores[2] = 100;                // change 3rd element to 100
        //System.out.println(scores[0]);  // prints 90

        int[][] matrix = {{1, 2}, {3, 4}};
    }
}
