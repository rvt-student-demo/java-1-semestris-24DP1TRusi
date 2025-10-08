package rvt;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array) {
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            int stars = 0;
            while (stars < number) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            index++;
        }
    }
}
