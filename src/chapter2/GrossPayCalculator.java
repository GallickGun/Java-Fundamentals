package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] arg){
        //1. Get the number of hours worked
        System.out.println("Hours spent working: ");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Pay rate: ");
        double payRate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hour * payRate;

        //4. Display result
        System.out.println("your gross pay is: "+ grossPay);
    }
}
