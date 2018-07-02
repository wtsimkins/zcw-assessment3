package com.zipcoder.assessment3.part1;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    /**
     * @return a Pattern that match any vowel
     */
    public static Pattern getVowelPattern() {
        String s = "hello";
        int count = 0;
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }
            return p;

    }

    /**
     * Given a string, return a new string with all the vowels removed
     * @param words String
     * @return
     */
    public static String removeVowel(String words) {
        words = words.replaceAll("[AEIOUaeiou]", "");
        return words;
    }

    /**
     * Return a lambda that takes an argument and multiple it by itself.
     * For example, given the argument is two, when I apply the function,
     * it will return 4.
     * @return return a function that will square a number
     */
    public static Function<Integer, Integer> getSquareFunction() {
        return (Integer x) -> x * x;

    }

    /**
     * Given two Strings, check to see if the content is the same. It is case sensitive.
     * - If the two objects are null, then return true
     * - If one object is null, but the other is not, then return false
     * - If the content of the object is that same, then return true. Otherwise, return false.
     * @param object1
     * @param object2
     * @return return true if they have the same content, false otherwise
     */
    public static Boolean isEquals(String object1, String object2) {
        if (object1.equalsIgnoreCase(object2)) {
            return true;
        } else if (object1.equalsIgnoreCase(null) && object2.equalsIgnoreCase(null)) {
            return true;
        } else if (object1 == null && object2.equalsIgnoreCase("1")) {
            return false;
        } else if (object1.equalsIgnoreCase(null) && !(object2.equalsIgnoreCase(null))){
            return false;
        }
        return false;

    }
}
