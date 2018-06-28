package com.zipcoder.assessment3.part1;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalInt;
import java.util.function.Function;
import java.util.regex.Pattern;

public class Part1Test {

    @Test
    public void testGetVowelPattern(){
        Pattern pattern = Part1.getVowelPattern();

        Assert.assertTrue(pattern.matcher("a").matches());
        Assert.assertTrue(pattern.matcher("e").matches());
        Assert.assertTrue(pattern.matcher("i").matches());
        Assert.assertTrue(pattern.matcher("o").matches());
        Assert.assertTrue(pattern.matcher("u").matches());
        Assert.assertFalse(pattern.matcher("b").matches());
        Assert.assertFalse(pattern.matcher("z").matches());

    }


    @Test
    public void testRemoveVowel(){
        String words = "greenappleisnotsweet";

        String actual = Part1.removeVowel(words);

        String expected = "grnpplsntswt";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveVowel_whenThereAreNoVowel(){
        String words = "fdphthng";

        String actual = Part1.removeVowel(words);

        String expected = "fdphthng";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLambda(){
        Function<Integer, Integer> square = Part1.getSquareFunction();

        int resultFor3 = square.apply(3);
        Assert.assertEquals(9, resultFor3);

        int resultFor2 = square.apply(2);
        Assert.assertEquals(4, resultFor2);

    }

    @Test
    public void testEquals_whenBothAreNull(){
        Assert.assertTrue(Part1.isEquals(null, null));
    }

    @Test
    public void testEquals_whenFirstArgumentIsNull(){
        Assert.assertFalse(Part1.isEquals(null, "1"));
    }

    @Test
    public void testEquals_whenSecondArgumentIsNull(){
        Assert.assertFalse(Part1.isEquals("1", null));
    }

    @Test
    public void testEquals_whenValueAreDifferent(){
        Assert.assertFalse(Part1.isEquals("1", "2"));
    }

    @Test
    public void testEquals_whenValueAreTheSame(){
        Assert.assertTrue(Part1.isEquals("2", String.valueOf(2)));
    }
}
