package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SumTheMiddleNumbersTest {

//    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Test Sums input numbers excluding smallest and largest")
    public void sumTheMiddleNumbers() {

        //Arrange
        int [] testInput1 = new int[]{5, 2, 6, 10, 22};
        int [] testInput2 = new int[]{};
        int [] testInput3 = new int[]{1,2};

        //Act
        int result1 = SumTheMiddleNumbers.sumTheMiddleNumbers(testInput1);
        int result2 = SumTheMiddleNumbers.sumTheMiddleNumbers(testInput2);
        int result3 = SumTheMiddleNumbers.sumTheMiddleNumbers(testInput3);

        //Assert
        assertEquals(21, result1);
        assertEquals(0, result2);
        assertEquals(0, result3);

    }

}
