package org.example;

public class Kata4 {

    public static String likesAndDislikes(String[] input) {

        int likes = 0;
        int dislikes = 0;

        for (String index : input) {
            if (index.equalsIgnoreCase("LIKE")) {
                likes++;
            }
            if (index.equalsIgnoreCase("DISLIKE")) {
                dislikes++;
            }
        }

        if (likes % 2 != 0 && dislikes % 2 !=0) {
            return "NEUTRAL";
        } else if(likes % 2 == 0 && dislikes % 2 !=0) {
            return "DISLIKE";
        } else if(likes % 2 != 0 && dislikes % 2 ==0){
            return "LIKE";
        }else {
            return "NEUTRAL";
        }
    }
}



