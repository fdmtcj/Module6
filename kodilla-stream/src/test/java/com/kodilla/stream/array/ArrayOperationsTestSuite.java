package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {12, 89, 91, 34, 72, 4, 41};


        //When
        double average = ArrayOperations.getAverage(numbers);


        //Then
        Assert.assertEquals(49.0, average, 0.01);


    }

    @Test
    public void testGetAverageWithEmptyTab() {
        //Given
        int[] numbers2 = new int[0];

        //When
        double average2 = ArrayOperations.getAverage(numbers2);

        //Then
        Assert.assertEquals(0, average2, 0.01);

    }
}
