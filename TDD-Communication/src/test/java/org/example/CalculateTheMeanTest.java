package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTheMeanTest {

    @Test
    @DisplayName("Test returns the average value of the array")
    public void testCalculateTheMean() {
        //Arrange
        int[] input1 = new int[]{40, 16, 5, 8};
        int[] input2 = new int[]{40, 16, 5, 8, 0};

        //Act
        double result1 = CalculateTheMean.calculateTheMean(input1);
        double result2 = CalculateTheMean.calculateTheMean(input2);
        //Assert
        assertEquals(17.25 ,result1);
        assertEquals(13.8 ,result2);

    }
}
