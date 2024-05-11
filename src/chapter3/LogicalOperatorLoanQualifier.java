package chapter3;

/*
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args){
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Input your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Input year of employment: ");
        int yearsEmployed = scanner.nextInt();
        scanner.close();

        if(salary >= requiredSalary && yearsEmployed >= requiredYearsEmployed){
            System.out.println("Congratulations! You are qualified for the loan program");
        } else{
            System.out.println("You must make at least " + requiredSalary + " to be eligible for the loan program");
        }

    }
}
