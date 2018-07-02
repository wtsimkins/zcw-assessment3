package com.zipcoder.assessment3.part2;

public class Animal implements AnimalInterface{

    Food food = new Food();
    protected int yearOfBirth;

    public Animal(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void eat(Food food) {
        food.consume();
    }
}
