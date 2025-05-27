package org.accenture.day1.lessons;

/*
* Abstraction is about modeling only the essential features of something, hiding the details.
* In Java you use abstract classes (with abstract methods) or interfaces to define a
* contract of what operations an object supports, without specifying how they’re carried out.
* Concrete subclasses or implementing classes then fill in the “how.”
* */

// TODO: 1) Create an abstract class Shape with `abstract String describe()`
// TODO: 2) Create a subclass Circle with a `double radius` field
// TODO: 3) Implement describe() in Circle to include the radius
// TODO: 4) Demonstrate instantiating Circle and calling describe()

public class Lesson07Abstraction {

    public static abstract class Shape {
        public abstract String describe();
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public String describe() {
            return "Circle with radius " + radius;
        }
    }
}