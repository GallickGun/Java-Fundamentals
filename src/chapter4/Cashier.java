package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        System.out.println("Enter the number of item you would like to scan: ");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();

        double total = 0;

        for(int i = 0; i<quantity;i++){

            System.out.println("Enter the cost of item: ");
            double price = sc.nextDouble();

            total = total + price;

        }

        sc.close();

        System.out.println("Your total is $" + total);
    }
}
