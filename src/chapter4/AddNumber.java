package chapter4;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Add your first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Add your second number: ");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("Total sum of those numbers is: " + sum);

            System.out.println("Would you like to start over? [True or False] ");
            again = scanner.nextBoolean();


        } while(again);

            scanner.close();
    }
}
