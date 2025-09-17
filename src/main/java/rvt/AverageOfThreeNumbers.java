package rvt;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number:");
    int pirmais = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int otrais = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the third number:");
    int tresais = Integer.valueOf(scanner.nextLine());

    System.out.println("The average is " + ((pirmais + otrais + tresais) * 1.0 / 3)); // jāpareizina ar 1.0, lai sanāktu flaot vērtība, kas vajadzīga rezultātā
    scanner.close();
}
}
