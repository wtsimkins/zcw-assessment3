package com.zipcoder.assessment3.part3;

public abstract class Ageable {
    protected int yearOfBirth;

    public Ageable(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }
}
