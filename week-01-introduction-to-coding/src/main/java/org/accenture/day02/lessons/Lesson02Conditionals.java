package org.accenture.day02.lessons;

import java.awt.desktop.AppForegroundListener;

public class Lesson02Conditionals {

    int a, b = 5;
    int defaultValue;

    //TODO Run this.
    //  Fix if it crashes
    public void crash() {
        if (10 / defaultValue > 0) {
            System.out.println("I did not crash.");
        } else {
            System.out.println("Something else happened.");
        }
    }

    // TODO Write a method that returns 'firstInput is greater or equal'
    //  if parameter integer firstInput is greater than or equal to parameter integer secondInput
    //  otherwise it returns 'secondInput is greater'
    //  if secondInput is greater than firstInput

    // TODO Write a method that returns 'Hello' if integer parameter 'a' is positive
    //  and returns 'World' if integer parameter 'b' is positive

    public void run(String userRole, String data) {
        if(userRole.equals(ApplicationConstants.ROLE_USER)) {
            System.out.println(validateRole(userRole, data));
        }
        if(userRole.equals(ApplicationConstants.ROLE_ADMIN)) {
            System.out.println(validateRole(userRole, data));
        }
    }
    public Integer validateRole(String userRole, String data) {
        if(userRole.equals(ApplicationConstants.ROLE_ADMIN)) {
            int result = validateRole(userRole, data);
            System.out.println("Validation Passed.");
            return result;
        }
        return someMethodThatCrashes();
    }

    public int someMethodThatReturns200(String userRole, String data) {
        return 200;
    }
    public int someMethodThatCrashes() {
        throw new RuntimeException();
    }
    public Lesson02Conditionals() {
        System.out.println("Lesson02Conditionals constructor start.");
        // if, else if, and else statements
        if (a > b) {
            // A is greater than B
        } else if (a == b) {
            // A and B are equal
        } else {
            // "B is greater than A"
        }

        int day = 1;
        String dayText = "";

        // TODO What happens here
        // switch statements
        switch (day) {
            case 1:
                dayText = "Monday";
                break;
            case 2:
                dayText = "Tuesday";
                break;
            default:
                dayText = "Another Day";
        }

        switch (day) {
            case 1:
                dayText = "Monday";
            case 2:
                dayText = "Tuesday";
                break;
            default:
                dayText = "Another Day";
        }

        // Ternary Operator
        String result = (a > b) ? "A is greater" : "B is greater or equal";

        System.out.println("Lesson02Conditionals constructor end.");
    }
}
