package org.accenture.day04;

import org.accenture.day04.worksheet.Day04Worksheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04WorksheetTests {

    Day04Worksheet solution = new Day04Worksheet();

    @Test
    void testExample1() {
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        assertEquals(3, result);
    }

    @Test
    void testExample2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        assertEquals(2, result);
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        int result = solution.majorityElement(nums);
        assertEquals(1, result);
    }

    @Test
    void testAllSameElements() {
        int[] nums = {4, 4, 4, 4};
        int result = solution.majorityElement(nums);
        assertEquals(4, result);
    }

    @Test
    void testMajorityAtEnd() {
        int[] nums = {1, 2, 3, 4, 4, 4, 4};
        int result = solution.majorityElement(nums);
        assertEquals(4, result);
    }

    @Test
    void testMajorityAtStart() {
        int[] nums = {9, 9, 9, 1, 2};
        int result = solution.majorityElement(nums);
        assertEquals(9, result);
    }

    @Test
    void testLargeInput() {
        int[] nums = new int[10001];
        for (int i = 0; i < 6000; i++) nums[i] = 7;
        for (int i = 6000; i < 10001; i++) nums[i] = i % 3;
        int result = solution.majorityElement(nums);
        assertEquals(7, result);
    }
}
