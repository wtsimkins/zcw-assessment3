package com.zipcoder.assessment3.part1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleterTest {

    private MultiplesDeleter deleter;

    @Before
    public void setup() {
        deleter = new MultiplesDeleter();
    }


    @Test
    public void deleteEvensTest() {
        // Given
        Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = { 1, 3, 5, 7, 9 };

        // When
        Integer[] actual = deleter.deleteEvens(inputArray);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void deleteOddsTest() {
        // Given
        Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = {  2, 4, 6, 8, 10 };

        // When
        Integer[] actual = deleter.deleteOdds(inputArray);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void deleteMultiplesOf3Test() {
        // Given
        Integer[] inputArray = { 3, 6, 9, 12, 15, 4, 7, 10, 13, 16};
        Integer[] expected = {4, 7, 10, 13, 16};

        // When
        Integer[] actual = deleter.deleteMultiplesOf3(inputArray);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void deleteMultiplesOfNTest() {
        // Given
        Integer multiple = 6;
        Integer[] inputArray = { 6, 12, 18, 24, 30, 4, 7, 10, 13, 16};
        Integer[] expected = {4, 7, 10, 13, 16};

        // When
        Integer[] actual = deleter.deleteMultiplesOfN(inputArray, multiple);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

}
