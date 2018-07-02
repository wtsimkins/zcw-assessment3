package com.zipcoder.assessment3.part2;

public class Horse extends Animal implements Eater{

    //private boolean pattedTheFlanks = false;
    public Horse(int yearOfBirth) {
        super(yearOfBirth);
    }

    @Override
    public int getAge() {
        double age = (CURRENT_YEAR - getYearOfBirth()) * 6.5;
        return (int)age;
    }

    public boolean kickedMe(boolean pattedTheFlanks) {
        return false;
    }
}
