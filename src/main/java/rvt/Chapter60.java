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

        // int[] valA = { 13, -22, 82, 17};
        // int[] valB = { 0, 0, 0, 0};

        // ex4(valA, valB);

        // System.out.println( "valA: "
        // + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );

        // System.out.println( "valB: "
        // + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        // System.out.println( "sum: "
        // + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " "
        // + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );

        
        int[] val = {0, 1, 2, 3};

        System.out.println( "Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        // reverse the order of the numbers in the array
        ex5(val);

        System.out.println( "Reversed Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
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
        for (int index = 0; index < valA.length; index++) {
            valB[index] = 25 - valA[index];
        }
    }

    public static void ex5(int[] val) {
        int temp = val[0];
        val[0] = val[3];
        val[3] = temp;

        temp = val[1];
        val[1] = val[2];
        val[2] = temp;

        // int index = 0;
        // int len = val.length;
        // while (index < len) {
        // if (index < len) {
        // int temp = val[index];
        // val[index] = val[len - index];
        // val[len - index] = temp;
        // } else {
        // break;
        // }
        // index++;
    }
}
