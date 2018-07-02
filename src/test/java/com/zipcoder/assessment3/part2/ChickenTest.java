package com.zipcoder.assessment3.part2;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void testGetAge(){
        int threeYearsAgo = AnimalInterface.CURRENT_YEAR - 3;
        Chicken chicken = new Chicken(threeYearsAgo);

        int actualAge = chicken.getAge();

        int expectedAge = 30;
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testSuperClass(){
        Chicken chicken = new Chicken(1);

        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void testProduce(){
        String expected = "egg";
        Chicken chicken = new Chicken(1);

        String actual = chicken.produce();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat(){
        Food food = new Food();
        Eater chicken = new Chicken(1);

        chicken.eat(food);

        Assert.assertTrue(food.isEaten());
    }
}
