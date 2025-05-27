package org.accenture.day1.lessons;

/*
* Encapsulation is the practice of keeping an object’s internal state (its fields) hidden from the outside world,
* and only exposing controlled “windows” (getters/setters or public methods)
* through which that state can be read or modified. In Java you typically mark your fields private
* and then provide public accessor methods. This guards against invalid or unintended
* changes and lets you change your implementation later without breaking client code.
 * */

// TODO: 1) Add two private fields: String name, int number
// TODO: 2) Create a constructor to initialize both fields
// TODO: 3) Generate public getters for each field
// TODO: 4) Generate public setters for each field
// TODO: 5) In the constructor or below, demonstrate updating and accessing fields via getters/setters

public class Lesson04Encapsulation {
    private String name;
    private int number;

    public Lesson04Encapsulation(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}