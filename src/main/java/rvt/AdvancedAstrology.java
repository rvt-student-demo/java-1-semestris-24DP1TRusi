package rvt;

public class AdvancedAstrology {
    public static void main(String[] args) {

        christmasTree(10);
    }
    public static void printSpaces(int number) {
        int space = 1;
        while (space <= number) {
            System.out.print(" ");
            space++;
        }
    }
    public static void printStars(int number) {
        int stars = 0;
        while (stars < number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }
    public static void printTriangle(int size) {
        int i = size;
        while (i > 0) {
            printSpaces(i - 1);
            printStars(size - i + 1);
            i--;
        }
    }
    public static void christmasTree(int height) {
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i * 2 - 1);
            i++;
        }

        int n = 1;
        while (n < 3) {
            printSpaces(height - 2);
            printStars(3);
            n++;
        }
    }
}
