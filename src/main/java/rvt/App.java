package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            book.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String ans = scanner.nextLine();
        if (ans.equals("everything")) {
            for (Book title: book) {
                System.out.println(title);
            }
        } else if (ans.equals("name")) {
            for (Book title: book) {
                System.out.println(title.name());
            }
        }
        scanner.close();
    }





// public static void divisibleByThreeInRange(int beginning, int end) {
//     while (beginning <= end) {
//         if (beginning % 3 == 0) {
//             System.out.println(beginning);
//         }
//         beginning++;
//     }// for (int i = beginning; i <= end; i++)
// }
}
// Scanner scanner = new Scanner(System.in);
//         System.out.println("Password?");
//         String word = scanner.nextLine();

//         if (word.equals("Caput Draconis")) {
//             System.out.println("Welcome!");
//         } else {
//             System.out.println("Off with you!");
//         }
//         scanner.close();

// while (true) {
//             System.out.println("Give a number:");
//             int num = Integer.valueOf(scanner.nextLine());
//             if (num == 4) {
//                 break;
//             }
//         }

// Scanner scanner = new Scanner(System.in);
//         int num = Integer.valueOf(scanner.nextLine());

//         for (int i = 0; i <= num; i++) {
//             System.out.println(i);
//         }
//         scanner.close();



//         divisibleByThreeInRange(2, 10);