package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent!";
            case "B" -> "Great!";
            case "C" -> "Good!";
            case "D" -> "Try harder!";
            case "F" -> "Uh oh!";
            default -> "Error! Invalid grade!";
        };

        System.out.println(message);
    }
}
