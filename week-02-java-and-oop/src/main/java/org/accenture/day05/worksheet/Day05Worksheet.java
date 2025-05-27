package org.accenture.day05.worksheet;


public class Day05Worksheet {

    // === Encapsulation ===

    /** 1) Instantiate with ("Alice", 10) and return name + number */
    public String encapsulationExercise1() {
        // TODO
        return null;
    }

    /** 2) Instantiate, setName("Bob"), setNumber(20), and return name + number */
    public String encapsulationExercise2() {
        // TODO
        return null;
    }

    /** 3) Instantiate with ("Test",5) and return name.length() + number */
    public int encapsulationExercise3() {
        // TODO
        return 0;
    }

    // === Inheritance ===

    /** 4) Parent p = new Parent(); return p.describe() */
    public String inheritanceExercise1() {
        // TODO
        return null;
    }

    /** 5) SubClass c = new SubClass(); return c.describe() */
    public String inheritanceExercise2() {
        // TODO
        return null;
    }

    /** 6) Parent p = new SubClass(); return p.describe() */
    public String inheritanceExercise3() {
        // TODO
        return null;
    }

    // === Polymorphism ===

    /** 7) Greeter g = new EnglishGreeter(); return g.greet("Alice") */
    public String polymorphismExercise1() {
        // TODO
        return null;
    }

    /** 8) Greeter g = new SpanishGreeter(); return g.greet("Bob") */
    public String polymorphismExercise2() {
        // TODO
        return null;
    }

    /** 9) Greeter[] arr = {EnglishGreeter, SpanishGreeter}; greet("Test") on each, join with ";" */
    public String polymorphismExercise3() {
        // TODO
        return null;
    }

    // === Abstraction ===

    /** 10) Shape s = new Circle(3.0); return s.describe() */
    public String abstractionExercise1() {
        // TODO
        return null;
    }

    /** 11) Circle c = new Circle(4.0); return c.describe().length() */
    public int abstractionExercise2() {
        // TODO
        return 0;
    }

    /**
     * 12) Design a small app scenario (like Day04Worksheet) using model and service classes with the following constraints:
     *
     *    - Create a 'Repository' interface to simulate a database layer.
     *    - Implement at least 2 concrete repository classes using Java collections (e.g., HashMap, List, Queue, etc.) as mock databases.
     *    - Create a base model class (e.g., BaseEntity) to track common fields like 'createdAt' and 'updatedAt'.
     *
     * Follow-up:
     *    - Design a new model & service class using a test-first approach (TDD).
     *    - Write unit tests before implementing the service logic.
     */
}
