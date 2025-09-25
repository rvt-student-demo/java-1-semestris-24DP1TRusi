package rvt;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNum = 0;
        int sumOfNum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num != 0) {
                numOfNum = numOfNum + 1;
                sumOfNum = sumOfNum + num;
                continue;
            }
        }
        System.out.println("Number of numbers: " + numOfNum);
        System.out.println("Sum of the numbers: " + sumOfNum);
        scanner.close();
    }
}