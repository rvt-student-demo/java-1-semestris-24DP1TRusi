package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skrūvju skaits:");
        int skr = Integer.valueOf(scanner.nextLine());
        System.out.println("Uzgriežņu skaits:");
        int uzg = Integer.valueOf(scanner.nextLine());
        System.out.println("Paplākšņu skaits:");
        int pap = Integer.valueOf(scanner.nextLine());

        if (!(uzg >= skr) && !(pap >= (skr * 2))) {
            System.out.println("Pārbaudi psūtījumu: par maz uzgriežņu");
            System.out.println("Pārbaudi psūtījumu: par maz paplākšņu");
        } else if (!(uzg >= skr)) {
            System.out.println("Pārbaudi psūtījumu: par maz uzgriežņu");
        } else if (!(pap >= (skr * 2))) {
            System.out.println("Pārbaudi psūtījumu: par maz paplākšņu");
        } else {
            System.out.println("Pasūtījums ir kārtībā.");
        }

        final int skrPrice = 5;
        final int uzgPrice = 3;
        final int paptPrice = 1;

        System.out.println("Kopējā cena: " + ((skr * skrPrice) + (uzg * uzgPrice) + (pap * paptPrice)));

        scanner.close();
    }
}
