package com.zipcoder.assessment3.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for(int i = 0; i < objectArray.length; i++){
            if (objectToCount == objectArray[i]){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        Object[] filteredArray = Arrays.stream(objectArray)
                .filter(e -> !e.equals(objectToRemove)).toArray(Object[]::new);
        return filteredArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int mostCommon = 0;
        int numOfCommon = 0;
        for(int i = 0; i < objectArray.length; i++){
            int temp = getNumberOfOccurrences(objectArray, i);
            if(temp > numOfCommon){
                numOfCommon = temp;
                mostCommon = i;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        int leastCommon = 0;
        int numOfCommon = 0;
        for(int i = 0; i < objectArray.length; i++){
            int temp = getNumberOfOccurrences(objectArray, i);
            if(temp == 1) {
                numOfCommon = temp;
                leastCommon = i;
            }
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        ArrayList<Object> t1 = new ArrayList<>(Arrays.asList(objectArray));
        t1.addAll(Arrays.asList(objectArrayToAdd));
        return t1.toArray(new Object[t1.size()]);
    }
}
