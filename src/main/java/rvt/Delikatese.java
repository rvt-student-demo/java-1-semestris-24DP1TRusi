package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci:");
        String prece = scanner.nextLine();
        System.out.println("Ievadai cenu:");
        double cena = Double.valueOf(scanner.nextLine());
        System.out.println("Ekspress piegāde (0==nē, 1==jā):");
        int piegade = Integer.valueOf(scanner.nextLine());

        System.out.println("Rēķins:");
        System.out.println("    "  + prece + "    " + cena);

        if (cena < 10 && piegade == 1) {
            double piegcena = 2.00 + 3.00;
            System.out.println("    piegāde" + "    " + piegcena);
            System.out.println("    kopā" + "    " + (cena + piegcena));
        } else if (cena < 10 && piegade == 0) {
            double piegcena = 2.00;
            System.out.println("    piegāde" + "    " + piegcena);
            System.out.println("    kopā" + "    " + (cena + piegcena));
        } else if (cena > 10 && piegade == 1) {
            double piegcena = 0 + 3.00;
            System.out.println("    piegāde" + "    " + piegcena);
            System.out.println("    kopā" + "    " + (cena + piegcena));
        } else if (cena > 10 && piegade == 0) {
            double piegcena = 0;
            System.out.println("    piegāde" + "    " + piegcena);
            System.out.println("    kopā" + "    " + (cena + piegcena));
        }

        scanner.close();
    }
}
