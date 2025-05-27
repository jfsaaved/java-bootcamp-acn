package org.accenture.day05;

import org.accenture.day05.worksheet.Day05Worksheet;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Day05WorksheetTests {
    private final Day05Worksheet ws = new Day05Worksheet();

    // -- Encapsulation --
    @Test void testEncapsulationExercise1() {
        assertEquals("Alice10", ws.encapsulationExercise1());
    }
    @Test void testEncapsulationExercise2() {
        assertEquals("Bob20", ws.encapsulationExercise2());
    }
    @Test void testEncapsulationExercise3() {
        assertEquals(9, ws.encapsulationExercise3());
    }

    // -- Inheritance --
    @Test void testInheritanceExercise1() {
        assertEquals("I am the Parent", ws.inheritanceExercise1());
    }
    @Test void testInheritanceExercise2() {
        assertEquals("I am the Parent -> I am the Child", ws.inheritanceExercise2());
    }
    @Test void testInheritanceExercise3() {
        assertEquals("I am the Parent -> I am the Child", ws.inheritanceExercise3());
    }

    // -- Polymorphism --
    @Test void testPolymorphismExercise1() {
        assertEquals("Hello, Alice!", ws.polymorphismExercise1());
    }
    @Test void testPolymorphismExercise2() {
        assertEquals("¡Hola, Bob!", ws.polymorphismExercise2());
    }
    @Test void testPolymorphismExercise3() {
        assertEquals("Hello, Test!;¡Hola, Test!", ws.polymorphismExercise3());
    }

    // -- Abstraction --
    @Test void testAbstractionExercise1() {
        String desc = ws.abstractionExercise1().toLowerCase();
        assertTrue(desc.contains("circle") && desc.contains("3.0"));
    }
    @Test void testAbstractionExercise2() {
        assertEquals(22, ws.abstractionExercise2());
    }
}