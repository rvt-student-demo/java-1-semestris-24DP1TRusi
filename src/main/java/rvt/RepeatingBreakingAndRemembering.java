package rvt;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int numSum = 0;
        int numOfNum = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            numSum = numSum + num;
            numOfNum ++;
            if (num % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
        }
        double res = (double) numSum / numOfNum;
        System.out.println("Sum: " + numSum);
        System.out.println("Numbers: " + numOfNum);
        System.out.println("Average: " + res);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }
}
