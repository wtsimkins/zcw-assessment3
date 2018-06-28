package com.zipcoder.assessment3.part4;

public class BubbleSort {
    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = numbers[j + 1];
                }
            }
        }
        return numbers;
    }
}
