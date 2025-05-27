package org.accenture.day1.lessons;

public class Day5_OOP {

    public static void main(String[] args) {

        Lesson05Inheritance.Parent parent = new Lesson05Inheritance.Parent();

        Lesson05Inheritance.SubClass child = new Lesson05Inheritance.SubClass();

        System.out.println(parent.describe());
        System.out.println(child.describe());

    }
}
