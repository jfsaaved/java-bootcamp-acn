package org.accenture.day07.util;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGenerator {

    private static final String[] PREFIXES = {
            "Data", "Info", "Item", "Entity", "Object", "Payload", "Record"
    };

    private static final String[] SUFFIXES = {
            "01", "02", "X", "Alpha", "Beta", "Zeta", "99", "Temp", "Dev", "Prod"
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
