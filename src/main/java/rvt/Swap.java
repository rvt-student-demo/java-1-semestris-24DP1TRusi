package rvt;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arr));

        System.out.println("Give two indices to swap:");
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
