package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    // Global Variables
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        // Local variables
       double salary = getSalary();
       int creditScore =  getCreditScore();
        sc.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }


    public static double getSalary() {
        System.out.println("Input your salary: ");
        double salary = sc.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Input your credit score: ");
        int creditScore = sc.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){

        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser (boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You have been approved!");
        }else{
            System.out.println("Sorry.You have been declined!");
        }
    }


}
