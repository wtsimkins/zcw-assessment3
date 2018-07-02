package com.zipcoder.assessment3.part2;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void testGetYearOfBirth(){
        int yearOfBirth = 2011;
        Animal unicorn = new Unicorn(yearOfBirth);

        int actualYearOfBirth = unicorn.getYearOfBirth();

        Assert.assertEquals(yearOfBirth, actualYearOfBirth);
    }

    @Test
    public void testEat(){
        Food food = new Food();
        Animal unicorn = new Unicorn(1);

        unicorn.eat(food);

        Assert.assertTrue(food.isEaten());
    }

    private class Unicorn extends Animal {

        public Unicorn(int yearOfBirth) {
            super(yearOfBirth);
        }

        @Override
        public int getAge() {
            return 0;
        }
    }
}
