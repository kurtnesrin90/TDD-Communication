package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata3Test {

    @Test
    @DisplayName("Tests given a string returns the correct sum of ASCII codes for all chars")
    void testAddUpTheASCIICodes() {
        //Arrange
        String input1 = "northcoders";
        String input2 = "Nesrin";
        String input3 = "Jackson";
        String input4 = "";
        String input5 = "ABC123 !?*";


        //Act
        int result1 = Kata3.addUpTheASCIICodes(input1);
        int result2 = Kata3.addUpTheASCIICodes(input2);
        int result3 = Kata3.addUpTheASCIICodes(input3);
        int result4 = Kata3.addUpTheASCIICodes(input4);
        int result5 = Kata3.addUpTheASCIICodes(input5);

        //Assert
        assertAll(
                () -> assertEquals(1195, result1),
                () -> assertEquals(623, result2),
                () -> assertEquals(713, result3),
                () -> assertEquals(0, result4),
                () -> assertEquals(518, result5)
        );

    }
}
