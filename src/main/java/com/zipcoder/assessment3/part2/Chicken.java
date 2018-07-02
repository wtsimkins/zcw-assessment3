package com.zipcoder.assessment3.part2;

public class Chicken extends Animal implements Eater{

    public Chicken(int yearOfBirth) {
        super(yearOfBirth);
    }

    @Override
    public int getAge() {
        double age = (CURRENT_YEAR - getYearOfBirth()) * 10;
        return (int)age;
    }

    public String produce() {
        return "egg";
    }
}
