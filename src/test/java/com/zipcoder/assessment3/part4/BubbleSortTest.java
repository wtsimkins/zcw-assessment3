package com.zipcoder.assessment3.part4;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort_withMultipleNumbers(){
        int[] numbers = {9, 5, 2, 7, 3, 1};
        int[] actual = BubbleSort.sort(numbers);

        int[] expected = {1, 2, 3, 7, 5, 9};
        Assert.assertArrayEquals(expected, actual);
    }

}
