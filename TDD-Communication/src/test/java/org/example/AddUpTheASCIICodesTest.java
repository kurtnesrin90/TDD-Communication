package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddUpTheASCIICodesTest {

    @Test
    @DisplayName("Tests given a string returns the correct sum of ASCII codes for all chars")
    void testAddUpTheASCIICodes() {
        //Arrange
        String input1 = "northcoders";

        //Act
        int result1 = AddUpTheASCIICodes.addUpTheASCIICodes(input1);

        //Assert
        assertEquals(1194, result1);

    }
}
