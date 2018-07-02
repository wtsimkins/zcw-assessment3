package com.zipcoder.assessment3.part3;

import java.util.Arrays;

public class Shelter <T>{

    private T[] shelterArray;

    public int size() {
    return 0;
    }

    public void add(T ager) {
        T[] newArray = Arrays.copyOf(this.shelterArray, this.shelterArray.length + 1);
        newArray[newArray.length-1] = ager;
        this.shelterArray = newArray;
    }

    public T removeFirst() {
        return T;
    }

    public T getOldest() {
        return null;
    }
}
