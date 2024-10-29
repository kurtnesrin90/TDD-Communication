package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTheMeanTest {

    @Test
    @DisplayName("Test returns the average value of the array")
    public void testCalculateTheMean() {
        //Arrange
        int[] input1 = new int[]{1, 2, 3};
        //Act
        double result = CalculateTheMean.calculateTheMean(input1);
        //Assert
        assertEquals(2 ,result);

    }
}