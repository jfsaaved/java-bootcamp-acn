package org.accenture.day05.lessons;

/*
* Inheritance lets you form new classes (subclasses) based on existing ones (superclasses),
* inheriting fields and methods so you don’t have to rewrite common behavior. In Java you
* declare class Child extends Parent. The child automatically has all non-private
* members of the parent, and can override methods to specialize or augment behavior via @Override.
* */


// TODO: 1) Create a base class Parent with method `String describe()`
// TODO: 2) Create a subclass Child that extends Parent
// TODO: 3) Override describe() in Child and call super.describe()
// TODO: 4) Demonstrate instantiating Parent and Child
// TODO: 5) Show calling Parent.describe() vs. Child.describe()


public class Lesson05Inheritance {

    // Base class Parent
    public static class Parent {
        public String describe() {
            return "I am the Parent";
        }
    }

    // Subclass Child that extends Parent
    public static class SubClass extends Parent {
        @Override
        public String describe() {
            return super.describe() + " -> I am the Child";
        }
    }
}
