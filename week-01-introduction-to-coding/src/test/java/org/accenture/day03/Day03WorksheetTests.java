package org.accenture.day03;

import org.accenture.day03.worksheet.Day03Worksheet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    TODO Use this class to test your Day01Worksheet.java class.
    TODO Please do not change anything in this class.
 */
public class Day03WorksheetTests {

        @Test
    public  void testSumToN(){
            assertEquals(15, Day03Worksheet.sumToN(5));
            assertEquals(1, Day03Worksheet.sumToN(1));
            assertEquals(0, Day03Worksheet.sumToN(0));
        }

        @Test
    public void testFactorial(){
            assertEquals(720,Day03Worksheet.factorial(6));
            assertEquals(6, Day03Worksheet.factorial(3));
            assertEquals(1, Day03Worksheet.factorial(1));
        }

        @Test
    public void testFibonacci(){
            assertEquals(0, Day03Worksheet.fibonacci(0));
            assertEquals(1, Day03Worksheet.fibonacci(1));
            assertEquals(1, Day03Worksheet.fibonacci(2));
            assertEquals(2, Day03Worksheet.fibonacci(3));
            assertEquals(3, Day03Worksheet.fibonacci(4));
            assertEquals(5, Day03Worksheet.fibonacci(5));
        }

        @Test
    public void testContains(){
            assertTrue(Day03Worksheet.contains(new int[]{1,2,3}, 2));
            assertFalse(Day03Worksheet.contains(new int[]{1,2,3}, 5));
        }
    @Test
    public void testCountVowels() {
        assertEquals(5, Day03Worksheet.countVowels("aeiou"));
        assertEquals(2, Day03Worksheet.countVowels("hello"));
        assertEquals(0, Day03Worksheet.countVowels("xyz"));
    }

    @Test
    public void testFirstNMultiplesOfThree() {
        assertEquals("3", Day03Worksheet.firstNMultiplesOfThree(1));
        assertEquals("3,6,9", Day03Worksheet.firstNMultiplesOfThree(3));
        assertEquals("", Day03Worksheet.firstNMultiplesOfThree(0));
    }

    @Test
   public void testIsPrime() {
        assertTrue(Day03Worksheet.isPrime(7));
        assertTrue(Day03Worksheet.isPrime(2));
        assertFalse(Day03Worksheet.isPrime(4));
        assertFalse(Day03Worksheet.isPrime(1));
        assertFalse(Day03Worksheet.isPrime(0));
    }
    @Test
   public void testSumOfEvenNumbers() {
        assertEquals(6, Day03Worksheet.sumOfEvenNumbers(new int[]{1, 2, 3, 4}));
        assertEquals(0, Day03Worksheet.sumOfEvenNumbers(new int[]{1, 3, 5}));
        assertEquals(14, Day03Worksheet.sumOfEvenNumbers(new int[]{2, 4, 1, 8}));
    }

}
