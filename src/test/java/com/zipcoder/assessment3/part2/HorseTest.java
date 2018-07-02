package com.zipcoder.assessment3.part2;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testGetAge(){
        int tenYearsAgo = AnimalInterface.CURRENT_YEAR - 10;
        Horse horse = new Horse(tenYearsAgo);

        int actualAge = horse.getAge();

        int expectedAge = 65;
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testSuperClass(){
        Horse horse = new Horse(1);
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testEat(){
        Food food = new Food();
        Eater horse = new Horse(1);

        horse.eat(food);

        Assert.assertTrue(food.isEaten());
    }

    @Test
    public void testKicking(){
        Food food = new Food();
        Horse horse = new Horse(1);
		  Boolean pattedTheFlanks = true;

        Assert.assertFalse(horse.kickedMe(pattedTheFlanks));
    }
}
