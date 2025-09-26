package rvt;

import java.util.Random;
import java.util.Scanner;

public class Spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int res = random.nextInt(10) + 1;
        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin 3 mēģinājumos.");
        System.out.println("Ievadi minējumu:");

        int nep = 0;
        while (true) {
            int atb = Integer.valueOf(scanner.nextLine());

            if (atb == res) {
                System.out.println("PAREIZI!");
                System.out.println("Te esi uzvarējis spēli.");
                break;
            } else if (atb != res) {
                System.out.println("nepareizi");
                nep ++;
            }
            if (nep == 3) {
                System.out.println("Pareizais skaitlis bija " + res + ".");
                System.out.println("Tu esi zaudējis spēli.");
                break;
            }

        }
        scanner.close();

    }
}
