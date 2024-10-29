package org.example;

public class Kata1 {
    public static int sumTheMiddleNumbers(int[] input){
        int largest = 0;
        int smallest = Integer.MAX_VALUE;
        int sumTotal = 0;

        if (input.length < 1) return 0;

        for (int i = 0 ; i < input.length ; i++){
            // Find the largest int in array
            if (input[i] >= largest){
                largest = input[i];
            }
            // Find the smallest int in array
            if (input[i] <= smallest){
                smallest = input[i];
            }
            sumTotal += input[i];
        }

        // Total remaining ints in array


        return sumTotal - largest - smallest;
    };

}
