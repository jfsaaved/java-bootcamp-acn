package org.accenture.day01;

import org.accenture.day01.worksheet.Day01Worksheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    TODO Use this class to test your Day01Worksheet.java class.
    TODO Please do not change anything in this class.
 */
public class Day01WorksheetTests {
    @Test
    public void shouldReturnFixedInteger() {
        assertEquals(10, Day01Worksheet.getFixedInteger());
    }
    @Test
    public void shouldReturnSum() {
        assertEquals(10, Day01Worksheet.sum(5,5));
        assertEquals(5, Day01Worksheet.sum(2,3));
    }
    @Test
    public void shouldReturnDifference() {
        assertEquals(0, Day01Worksheet.difference(5,5));
        assertEquals(1, Day01Worksheet.difference(3,2));
    }
    @Test
    public void shouldReturnProduct() {
        assertEquals(25, Day01Worksheet.multiply(5,5));
        assertEquals(6, Day01Worksheet.multiply(3,2));
    }
    @Test
    public void shouldReturnQuotient() {
        assertEquals(1, Day01Worksheet.divide(5,5));
        assertEquals(2, Day01Worksheet.divide(6,3));
    }

    @Test
    public void shouldReturnRemainder() {
        assertEquals(1, Day01Worksheet.modulo(5,5));
        assertEquals(2, Day01Worksheet.modulo(6,3));
    }

    @Test
    public void shouldReturnEven() {
        assertEquals(true, Day01Worksheet.isEven(4));
        assertEquals(false, Day01Worksheet.isEven(7));
    }

    @Test
    public void shouldReturnOdd() {
        assertEquals(false, Day01Worksheet.isOdd(4));
        assertEquals(true, Day01Worksheet.isOdd(7));
    }
    @Test
    public void shouldReturnGreaterThan() {
        assertEquals(true, Day01Worksheet.isGreaterThan(4,2));
        assertEquals(false, Day01Worksheet.isGreaterThan(2,4));
    }

    @Test
    public void shouldReturnLesserThan() {
        assertEquals(false, Day01Worksheet.isLesserThan(4,2));
        assertEquals(true, Day01Worksheet.isLesserThan(2,4));
    }
    @Test
    public void shouldReturnHelloWorld() {
        assertEquals("Hello World!", Day01Worksheet.getHelloWorld());
    }

    @Test
    public void shouldReturnDoubleSum() {
        assertEquals(0.3, Day01Worksheet.getDoubleSum(0.1, 0.2), 0.1);
        assertEquals(0.5, Day01Worksheet.getDoubleSum(0.2, 0.3), 0.1);
    }

}
