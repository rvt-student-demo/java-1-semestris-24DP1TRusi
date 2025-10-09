package rvt;

public class Chapter60 {
    public static void main(String[] args) {
        // int[] val = {0, 1, 2, 3}; 
        // ex1(val);


        // int[] val = {13, -4, 82, 17}; 
        // int[] twice = new int[4];
        
        // System.out.println( "Original Array: " 
        // + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        // ex2(val, twice);

        // System.out.println( "New Array: " 
        // + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );

        // int[] valA   = { 13, -22,  82,  17}; 
        // int[] valB   = {-12,  24, -79, -13};
        // int[] sum    = {  0,   0,   0,   0};
        // ex3(valA, valB, sum);

        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {  0,   0,   0,   0};
    }

    public static void ex1(int[] arraySum) {
        int index = 0;
        int sumN = 0;
        while (index < arraySum.length) {
            int number = arraySum[index];
            sumN = sumN + number;
            index++;
        }
        System.out.println( "Sum of all numbers = " + sumN );
    }

    public static void ex2(int[] array, int[] twice) {

        for (int index = 0; index < array.length; index++) {
            int number = array[index];
            twice[index] = number * 2;
        }
    }

    public static void ex3(int[] valA, int[] valB, int[] sum) {
        for (int index = 0; index < sum.length; index++) {
            sum[index] = valA[index] + valB[index];
        }

        System.out.println( "sum: " 
        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
        
    }
    public static void ex4(int[] valA, int[] valB) {

    }
}
