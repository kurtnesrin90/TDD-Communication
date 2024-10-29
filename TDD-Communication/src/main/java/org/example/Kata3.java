package org.example;

public class Kata3 {
    public static int addUpTheASCIICodes(String input){

        // convert string intput to char array
        int sumTotal = 0;
        char[] inputArray = input.toCharArray();

        // iterate through each char and calculate ASCII code
        for (char letter : inputArray){

            // Add ASCII to sumtotal
            sumTotal += (int) letter;
        }

        return sumTotal;
    };
}
