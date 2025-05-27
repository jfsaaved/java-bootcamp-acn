package org.accenture.day05.lessons;

/*
* Polymorphism means “many forms.” In practice, it lets you write code against a general
* type (a superclass or interface) and at runtime have different concrete
* implementations plugged in. For example:
* */


// TODO: 1) Define an interface `Greeter` with `String greet(String name)`
// TODO: 2) Create two implementations: EnglishGreeter, SpanishGreeter
// TODO: 3) Instantiate each and call `greet("…")`
// TODO: 4) Demonstrate polymorphic assignment:
//           Greeter g = new EnglishGreeter();

public class Lesson06Polymorphism {

    public interface Greeter {
        String greet(String name);
    }

    public static class EnglishGreeter implements Greeter {
        @Override
        public String greet(String name) {
            return "Hello, " + name + "!";
        }
    }

    public static class SpanishGreeter implements Greeter {
        @Override
        public String greet(String name) {
            return "¡Hola, " + name + "!";
        }
    }
}