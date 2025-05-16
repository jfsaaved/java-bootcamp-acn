package org.accenture.day02;

import org.accenture.day02.worksheet.Day02Worksheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    TODO Use this class to test your Day02Worksheet.java class.
    TODO Please do not change anything in this class.
 */

public class Day02WorksheetTests {
    @Test
    public void testBothPositive() {
        assertTrue(Day02Worksheet.bothPositive(5, 10));
        assertFalse(Day02Worksheet.bothPositive(-5, 10));
        assertFalse(Day02Worksheet.bothPositive(0, 0));
    }

    @Test
    public void testOnlyOnePositive() {
        assertTrue(Day02Worksheet.onlyOnePositive(5, -3));
        assertTrue(Day02Worksheet.onlyOnePositive(-3, 5));
        assertFalse(Day02Worksheet.onlyOnePositive(3, 3));
        assertFalse(Day02Worksheet.onlyOnePositive(-1, -2));
    }

    @Test
    public void testCanVote() {
        assertTrue(Day02Worksheet.canVote(true, 18));
        assertTrue(Day02Worksheet.canVote(true, 30));
        assertFalse(Day02Worksheet.canVote(false, 20));
        assertFalse(Day02Worksheet.canVote(true, 17));
    }

    @Test
    public void testIsLeapYear() {
        assertTrue(Day02Worksheet.isLeapYear(2020));
        assertFalse(Day02Worksheet.isLeapYear(2019));
        assertFalse(Day02Worksheet.isLeapYear(1900));
        assertTrue(Day02Worksheet.isLeapYear(2000));
    }

    @Test
    public void testGradeLetter() {
        assertEquals("A", Day02Worksheet.gradeLetter(90));
        assertEquals("B", Day02Worksheet.gradeLetter(85));
        assertEquals("C", Day02Worksheet.gradeLetter(75));
        assertEquals("D", Day02Worksheet.gradeLetter(65));
        assertEquals("F", Day02Worksheet.gradeLetter(50));
    }

    @Test
    public void testNumberSign() {
        assertEquals("positive", Day02Worksheet.numberSign(5));
        assertEquals("negative", Day02Worksheet.numberSign(-3));
        assertEquals("zero", Day02Worksheet.numberSign(0));
    }

    @Test
    public void testIsBetween10And20() {
        assertTrue(Day02Worksheet.isBetween10And20(10));
        assertTrue(Day02Worksheet.isBetween10And20(15));
        assertTrue(Day02Worksheet.isBetween10And20(20));
        assertFalse(Day02Worksheet.isBetween10And20(9));
        assertFalse(Day02Worksheet.isBetween10And20(21));
    }

    @Test
    public void testIsMultipleOfThreeOrFive() {
        assertTrue(Day02Worksheet.isMultipleOfThreeOrFive(3));
        assertTrue(Day02Worksheet.isMultipleOfThreeOrFive(5));
        assertTrue(Day02Worksheet.isMultipleOfThreeOrFive(15));
        assertFalse(Day02Worksheet.isMultipleOfThreeOrFive(7));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", Day02Worksheet.fizzBuzz(9));
        assertEquals("Buzz", Day02Worksheet.fizzBuzz(10));
        assertEquals("FizzBuzz", Day02Worksheet.fizzBuzz(15));
        assertEquals("7", Day02Worksheet.fizzBuzz(7));
    }

    @Test
    public void testIsSumEven() {
        assertTrue(Day02Worksheet.isSumEven(2, 4));
        assertTrue(Day02Worksheet.isSumEven(1, 1));
        assertFalse(Day02Worksheet.isSumEven(1, 2));
        assertFalse(Day02Worksheet.isSumEven(3, 4));
    }

    @Test
    public void testMax() {
        assertEquals(10, Day02Worksheet.max(10, 5));
        assertEquals(10, Day02Worksheet.max(5, 10));
        assertEquals(7, Day02Worksheet.max(7, 7));
    }

    @Test
    public void testMin() {
        assertEquals(5, Day02Worksheet.min(10, 5));
        assertEquals(5, Day02Worksheet.min(5, 10));
        assertEquals(7, Day02Worksheet.min(7, 7));
    }

}
