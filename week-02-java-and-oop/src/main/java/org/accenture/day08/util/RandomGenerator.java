package org.accenture.day08.util;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGenerator {

    private static final String[] PREFIXES = {
            "Data", "Info", "Item", "Entity", "Object", "Payload", "Record"
    };
    private static final String[] SUFFIXES = {
            "-1", "-2", "-3", "-4", "-5",
            "-01", "-02", "-003", "-004", "-0005",
            "-10", "-11", "-12", "-13", "-20",
            "-69", "-420", "-666", "-999", "-1337",
            "-007", "-123", "-321", "-42", "-314",
            "-0001", "-9000", "-7777", "-2024", "-1999"
    };
    public static final Random RANDOM = new Random();

    public static String generateDataName() {
        String prefix = PREFIXES[RANDOM.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[RANDOM.nextInt(SUFFIXES.length)];
        int number = RANDOM.nextInt(1000);
        return prefix + suffix + number;
    }

    public static List<Integer> generateRandomList(int size, int bound) {
        return IntStream.range(0, size)
                .map(i -> RANDOM.nextInt(bound))
                .boxed()
                .collect(Collectors.toList());
    }
}
