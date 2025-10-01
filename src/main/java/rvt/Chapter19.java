package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter End:");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("");

        if ( start < end) {
        while (start <= end){
            System.out.println(start);
            start++;
            }
        } else if (start > end) {
            while (end <= start) {
                System.out.println(start);
                start--;
            }
        }
        scanner.close();
    }

    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int num = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + ((num*(num+1))/2));
        scanner.close();
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int num = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        int sumN = 0;
        for (int i = 1; i <= num; i++) {
            sumN = sumN + i;
            sum = sum + (i * i);
        }
        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + ((num * (num + 1)*(2 * num + 1))/6));
        System.out.println("sum of cubes = " + (sumN * sumN));

        scanner.close();
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low:");
        int low = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high:");
        int high = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        while (low <= high) {
            sum = sum + low;
            low++;
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println("");
        int times;
        times = word.length();

        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
        scanner.close();
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");
        String first = scanner.nextLine();
        System.out.println("Enter second word");
        String second = scanner.nextLine();
        System.out.println("");

        int one = first.length();
        int two = second.length();
        int sum = one + two;
        String points = ".";
        while (sum < 30) {
            points = points + ".";
            sum++;
        }

        System.out.println(first + points + second);

        scanner.close();
    }
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        int times = word.length();
        int index = 0;

        for (int i = 0; i < times; i++) {
            System.out.println(word.charAt(index));
            index++;
        }
        scanner.close();

    }
}
