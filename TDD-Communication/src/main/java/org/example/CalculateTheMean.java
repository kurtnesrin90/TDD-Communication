package org.example;

public class CalculateTheMean {

    public static double calculateTheMean(int[] input){

        double average = 0;

        for (int elements : input) {
            average += elements;
        }
        average = average / input.length;

        return average;
    }

}
