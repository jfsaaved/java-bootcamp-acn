package org.accenture.day01;

import org.accenture.day01.worksheet.Day01Worksheet;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *  TODO Use this class to test your Day01Worksheet.java class
 *      You can also:
 *      Think of other creative methods to make with what we learned in Day01
 *      Create a unit test for these methods
 *      Implement the methods in Day01Worksheet.java class
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Day01WorksheetTests {
    @Test
    public void Return_a_fixed_integer() {
        assertEquals(10, Day01Worksheet.getFixedInteger());
    }
    @Test
    public void Return_sum() {
        assertEquals(10, Day01Worksheet.sum(5,5));
        assertEquals(5, Day01Worksheet.sum(2,3));
    }
    @Test
    public void Return_difference() {
        assertEquals(0, Day01Worksheet.difference(5,5));
        assertEquals(1, Day01Worksheet.difference(3,2));
    }
    @Test
    public void Return_product() {
        assertEquals(25, Day01Worksheet.multiply(5,5));
        assertEquals(6, Day01Worksheet.multiply(3,2));
    }
    @Test
    public void Return_quotient() {
        assertEquals(1, Day01Worksheet.divide(5,5));
        assertEquals(2, Day01Worksheet.divide(6,3));
    }

    @Test
    public void Return_remainder() {
        assertEquals(1, Day01Worksheet.modulo(5,5));
        assertEquals(2, Day01Worksheet.modulo(6,3));
    }

    @Test
    public void Return_true_if_even_number() {
        assertEquals(true, Day01Worksheet.isEven(4));
        assertEquals(false, Day01Worksheet.isEven(7));
    }

    @Test
    public void Return_true_if_odd_number() {
        assertEquals(false, Day01Worksheet.isOdd(4));
        assertEquals(true, Day01Worksheet.isOdd(7));
    }
    @Test
    public void Return_true_if_first_value_is_greater_than_the_second_value() {
        assertEquals(true, Day01Worksheet.isGreaterThan(4,2));
        assertEquals(false, Day01Worksheet.isGreaterThan(2,4));
    }

    @Test
    public void Return_true_if_first_value_is_less_than_the_second_value() {
        assertEquals(false, Day01Worksheet.isLesserThan(4,2));
        assertEquals(true, Day01Worksheet.isLesserThan(2,4));
    }
    @Test
    public void Return_Hello_World_string() {
        assertEquals("Hello World", Day01Worksheet.getHelloWorld());
    }

    @Test
    public void Return_sum_of_doubles() {
        assertEquals(0.3, Day01Worksheet.getDoubleSum(0.1, 0.2), 0.1);
        assertEquals(0.5, Day01Worksheet.getDoubleSum(0.2, 0.3), 0.1);
    }

    @Test
    public void Reverse_a_3_digit_integer_using_only_math() {
        assertEquals(321, Day01Worksheet.reverse3Digits(123));
        assertEquals(654, Day01Worksheet.reverse3Digits(456));
    }

    //TODO Create 1-2 of your own unit tests for Day01Worksheet and make them pass

}
