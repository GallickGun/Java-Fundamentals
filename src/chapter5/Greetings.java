package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main (String[] args) {

        System.out.println("Hello, what's your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        greetUser(name);
    }

    public static void greetUser (String name) {
        System.out.println("Howdy, " + name + "!");
    }
}
