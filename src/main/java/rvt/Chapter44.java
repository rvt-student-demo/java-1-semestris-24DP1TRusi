package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word -->");
        String word = scanner.nextLine();
        ex7(word);


        scanner.close();
    }
    public static void ex1(String name) {
        name = name.trim();
        String last = name.substring(name.indexOf(" "));
        String first = name.substring(0, name.indexOf(" "));
        System.out.println("");
        System.out.println(first + last.toUpperCase());
        
    }

    public static void ex2(String str) {
        for (int inx = 0; inx < str.length(); inx++) {
            char i = str.charAt(inx);
            System.out.println(i);
        }
    }

    public static void ex3() {
    Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine();

            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                System.out.println("Ms. " + name + "\n");
            } else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                System.out.println("Mr. " + name + "\n");
            } else if (name == "") {
                break;
            } else {
                System.out.println(name + "\n");
            }
        }
        scanner.close();
    }

    public static void ex4(String time) {
        if (time.length() == 2) {
            System.out.println("Your time->  0:" + time);
        } else if (time.length() == 1) {
            System.out.println("Your time->  0:0" + time);
        } else if (time.length() == 3) {
            String min = time.substring(0, 1);
            String sec = time.substring(1);
            System.out.println("Your time->  " + min + ":" + sec);
        } else {
            String min = time.substring(0, 2); 
            String sec = time.substring(2);
            System.out.println("Your time->  " + min + ":" + sec);
        }
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String lines = scanner.nextLine();
            if (lines.trim().startsWith("//")) {
                System.out.println(lines);
            }
        }
        scanner.close();
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your password:");
            String pass = scanner.nextLine();
            if (pass.length() >= 7) {
                if (!(pass.equals(pass.toLowerCase())) && !(pass.equals(pass.toUpperCase()))) {
                    if (pass.matches(".*\\d.*")) {
                        System.out.println("Acceptable password.");
                        break;
                    } else {
                        System.out.println("That password is not acceptable.\n");
                    }
                } else {
                    System.out.println("That password is not acceptable.\n");
                }
            } else {
                System.out.println("That password is not acceptable.\n");
            }
        }
        scanner.close();

    }

    public static void ex7(String word) {
        int i = 0;
        int j = word.length();
        while (j - i >= 1) {
            System.out.println(" ".repeat(i) + word.substring(i, j));
            i++;
            j--;
        }
    }
}