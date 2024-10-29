package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata4Test {

    @Test
    @DisplayName("Tests multiple like inputs returns correct results")
    void testLikesAndDislikes1() {
        //Arrange
        String[] likeArrays1 = new String[]{"LIKE"};
        String[] likeArrays2 = new String[]{"LIKE", "LIKE", "LIKE", "LIKE", "LIKE"};
        String[] likeArrays3 = new String[]{"LIKE", "LIKE", "LIKE", "LIKE"};
        //Act
        String result1 = Kata4.likesAndDislikes(likeArrays1);
        String result2 = Kata4.likesAndDislikes(likeArrays2);
        String result3 = Kata4.likesAndDislikes(likeArrays3);
        //Assert
        assertAll(
                ()->assertEquals("LIKE", result1),
                ()->assertEquals("LIKE", result2),
                ()->assertEquals("NEUTRAL", result3)
        );
    }

    @Test
    @DisplayName("Tests various inputs returns correct results")
    void testLikesAndDislikes2() {
        //Arrange
        String[] feedbackArrays1 = new String[]{"like", "dislike", "DISLIKE", "LIKE"};
        String[] feedbackArrays2 = new String[]{"DISLIKE"};
        String[] feedbackArrays3 = new String[]{"DiSlIKe", "DISLIKE"};
        String[] feedbackArrays4 = new String[]{};
        String[] feedbackArrays5 = new String[]{"error"};
        //Act
        String result1 = Kata4.likesAndDislikes(feedbackArrays1);
        String result2 = Kata4.likesAndDislikes(feedbackArrays2);
        String result3 = Kata4.likesAndDislikes(feedbackArrays3);
        String result4 = Kata4.likesAndDislikes(feedbackArrays4);
        String result5 = Kata4.likesAndDislikes(feedbackArrays5);
        //Assert
        assertAll(
                ()->assertEquals("NEUTRAL", result1),
                ()->assertEquals("DISLIKE", result2),
                ()->assertEquals("NEUTRAL", result3),
                ()->assertEquals("NEUTRAL", result4),
                ()->assertEquals("NEUTRAL", result5)
        );
    }
}