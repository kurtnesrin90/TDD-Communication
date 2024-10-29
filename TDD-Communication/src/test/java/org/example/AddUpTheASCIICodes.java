package org.example;

public class AddUpTheASCIICodes {
    public static int addUpTheASCIICodes(String input){

        // convert string intput to char array
        int sumTotal = 0;
        char[] inputArray = input.toCharArray();

        // iterate through each char and calculate ASCII code
        for (char letter : inputArray){

            sumTotal += (int) letter;
//            System.out.println(sumTotal);
        }

        // Add ASCII to sumtotal

        return sumTotal;
    };
}
