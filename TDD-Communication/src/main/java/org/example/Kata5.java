package org.example;

public class Kata5 {
    public static String aCaesarCipher (String input){

        if (input == null)return "";

        char[] arrayInput = input.toCharArray();
        StringBuilder output = new StringBuilder();
        char chipherLetter = 'A';



        for (int i = 0  ; i < arrayInput.length ; i++) {
                if (Character.isLowerCase(arrayInput[i])){
                    chipherLetter = (char)((((arrayInput[i] - 'a') + 13) % 26) + 'a');
                } else if (Character.isUpperCase(arrayInput[i])) {
                    chipherLetter = (char)((((arrayInput[i] - 'A') + 13) % 26) + 'A');
                } else {
                    chipherLetter = arrayInput[i];
                }
                output.append(chipherLetter);

        }
//        System.out.println("PRINTED INPUT: " + input);
//        System.out.println("PRINTED OUTPUT: " + output + "\n");
        return output.toString();
    }
}
