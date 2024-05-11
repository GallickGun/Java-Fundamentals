package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main (String[] args){
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Input your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Year of employment: ");
        int yearsEmployed = scanner.nextInt();
        scanner.close();

        if(salary >= requiredSalary){
            if(yearsEmployed >= requiredYearsEmployed){
                System.out.println("Congratulations! You are qualified for the loan program!");
            }else{
                System.out.println("You are not qualified for the loan program.");
            }
        } else{
            System.out.println("You must at least make " + requiredSalary +" to be qualified for the loan program");
        }
    }
}



