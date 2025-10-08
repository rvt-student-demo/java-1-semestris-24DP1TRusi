package rvt;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }
    public static void sumOfNumbersInArray(int[] array) {
        int index = 0;
        int sumN = 0;
        while (index < array.length) {
            int number = array[index];
            sumN = sumN + number;
            index++;
        }
        System.out.println(sumN);
    }
}
