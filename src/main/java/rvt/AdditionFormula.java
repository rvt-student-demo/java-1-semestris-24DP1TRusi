package rvt;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number:");
    int pirmais = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int otrais = Integer.valueOf(scanner.nextLine());
    System.out.println(pirmais + " + " + otrais + " = " + (pirmais + otrais));
    scanner.close();
}
}
