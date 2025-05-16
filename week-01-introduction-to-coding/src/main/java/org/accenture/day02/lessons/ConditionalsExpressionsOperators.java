package org.accenture.day02.lessons;

public class ConditionalsExpressionsOperators {

    public static void main(String[] args) {
        expressionsAndOperators();
        conditionals();
        shortCircuiting();
        ternaryExample();
        equalityVsEquals();
        floatComparison();
    }

    static void expressionsAndOperators() {
        int a = 10, b = 5;
        int sum = a + b;
        int product = a * b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Remainder: " + remainder);
    }

    static void conditionals() {
        int age = 17;

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("Full access");
                break;
            case "user":
                System.out.println("Limited access");
                break;
            default:
                System.out.println("No access");
        }
    }

    static void shortCircuiting() {
        int x = 0;
        if (x != 0 && 10 / x > 1) {
            System.out.println("Won't crash");
        } else {
            System.out.println("Short-circuit prevented division by zero");
        }
    }

    static void ternaryExample() {
        int score = 72;
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }

    static void equalityVsEquals() {
        String a = new String("hello");
        String b = new String("hello");

        System.out.println("a == b: " + (a == b));           // false
        System.out.println("a.equals(b): " + a.equals(b));   // true
    }

    static void floatComparison() {
        double a = 0.1 + 0.2;
        double b = 0.3;
        double epsilon = 0.000001;

        if (Math.abs(a - b) < epsilon) {
            System.out.println("a and b are effectively equal");
        } else {
            System.out.println("a and b are not equal");
        }
    }
}
