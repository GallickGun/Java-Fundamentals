package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args){

        int numberOfStudents = 24;
        int numberOfTest = 4;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <numberOfStudents; i++) {

            double total = 0;

            for(int j = 0; j <numberOfTest; j++) {

                System.out.println("Enter score for test #"+ (j+1));
                double score = sc.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTest;
            System.out.println("The average score test for student #" + (i+1) + " is " + average);
        }

        sc.close();
    }
}
