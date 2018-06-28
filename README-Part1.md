# Section 1 - ArrayUtils
* Ensure each of the test cases in the class [Arrayutils]() successfully passes upon completion of each of the method stubs in the class [ArrayutilsTest]().
    * `Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)`
    * `Object[] removeValue(Object[] objectArray, Object objectToRemove)`
    * `Object getMostCommon(Object[] objectArray)`
    * `Object getLeastCommon(Object[] objectArray)`
    * `Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd)`

### `Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)`
* **Description**
    * Given an array of objects of any `type` and an `object` of the same `type`, return the number of times the `object` occurs in the array. Example, given an array of `{1, 2, 4, 2, 2}`, countOccurrences would return `3` if the object to count is `2`.

#### Example

```
   // Given
        Integer valueToEvaluate = 7;
        Integer expected = 3;
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};

        // When
        Integer outcome = ArrayUtils.getNumberOfOccurrences(inputArray, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, outcome);
```

### `Object[] removeValue(Object[] objectArray, Object objectToRemove)`
* **Description**
    * Given an array of objects, named `objectArray`, and an object `objectToRemove`, remove all occurrences of `objectToRemove` in the array. Example, given array `{4, 1, 1, 5}` and the objectToRemove is 1, the return array is `{4, 5}`

#### Example

```
    // Given
    Integer valueToRemove = 1;
    Object[] expected = {4, 5};
    Integer[] inputArray = {4, 1, 1, 5};

    // When
    Object[] actual = ArrayUtils.removeValue(inputArray, valueToRemove);

    // Then
    Assert.assertArrayEquals(expected, actual);
```

### `Object getMostCommon(Object[] objectArray)`
* **Description**
    * Given an array of objects, named `objectArray` return the most frequently occurring object in the array. Example, given `{1, 3, 4, 3}`, the method will return 3.

#### Example
* Sample Script

```
   // Given
    Integer expected = 3;
    Integer[] inputArray = {1, 3, 4, 3};

    // When
    Integer outcome = ArrayUtils.getMostCommon(inputArray);

    // Then
    Assert.assertEquals(expected, outcome)
```

### `Object getLeastCommon(Object[] objectArray)`
* **Description**
    * Given an array of objects, named `objectArray` return the least frequently occurring object in the array. Example, given `{1, 3, 4, 3, 4, 4}`, the method will return 1.

#### Example
* Sample Script

```
   // Given
    Integer expected = 1;
    Integer[] inputArray = {1, 3, 4, 3, 4, 4};

    // When
    Integer outcome = ArrayUtils.getLeastCommon(inputArray);

    // Then
    Assert.assertEquals(expected, outcome)
```


### `Object mergeArrays(Object[] objectArray)`
* **Description**
    * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`

#### Example

```
    // Given
    Integer[] array1 = {1,1,1,2,2,2};
    Integer[] array2 = {3,3,3,4,4,4};
    Object[] expected = {1,1,1,2,2,2,3,3,3,4,4,4};

    // When
    Object[] actual = ArrayUtils.mergeArrays(array1, array2);

    // Then
    Assert.assertArrayEquals(expected, actual);
```

# Section 2 - MultiplesDeleter
  * Ensure each of the test cases in the class [MultiplesDeleter]() successfully passes upon completion of each of the method stubs in the class [MultiplesDeleterTest]().
      * `Integer[] deleteEvens(Integer[] intArray)`
      * `Integer[] deleteOdds(Integer[] intArray)`
      * `Integer[] deleteMultiplesOf3(Integer[] intArray)`
      * `Integer[] deleteMultiplesOfN(Integer[] intArray)`

### `Integer[] deleteEvens(Integer[] intArray)`
**Description**
* Given an array of integers, named `ints` return an identical array with odds removed.

#### Example
  * Sample Script

```
   // Given
   // Given
   Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   Integer[] expected = { 1, 3, 5, 7, 9 };

   // When
   Integer[] actual = deleter.deleteEvens(inputArray);

   // Then
   Assert.assertArrayEquals(expected, actual);
```
<br><br>
## `Integer[] deleteOdds(Integer[] intArray)`
**Description**
* Given an array of integers, named `ints` return an identical array with odds removed

#### Example
  * Sample Script

```
    Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Integer[] expected = {  2, 4, 6, 8, 10 };

    // When
    Integer[] actual = deleter.deleteOdds(inputArray);

    // Then
    Assert.assertArrayEquals(expected, actual);
```

### `Integer[] deleteMultiplesOf3(Integer[] ints)`
**Description**
* Given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed.

#### Example
  * Sample Script

```
    // Given
    Integer[] inputArray = { 3, 6, 9, 12, 15, 4, 7, 10, 13, 16};
    Integer[] expected = {4, 7, 10, 13, 16};

    // When
    Integer[] actual = deleter.deleteMultiplesOf3(inputArray);

    // Then
    Assert.assertArrayEquals(expected, actual);
```


### `Integer[] deleteMultiplesOfN(Integer[] ints, int multiple)`
**Description**
* Given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed.

#### Example
  * Sample Script

  ```
      // Given
      Integer multiple = 6;
      Integer[] inputArray = { 6, 12, 18, 24, 30, 4, 7, 10, 13, 16};
      Integer[] expected = {4, 7, 10, 13, 16};

      // When
      Integer[] actual = deleter.deleteMultiplesOfN(inputArray, multiple);

      // Then
      Assert.assertArrayEquals(expected, actual);
  ```

# Section 3 - Part1
* Ensure each of the test cases in the class `Part1` successfully passes upon completion. See test for details.

1. `Pattern getVowelPattern()`
    1. Create a regex pattern that match any lower case vowel. For example, if I need to match a number I would return `Pattern.compile("[1-9]")`.
2. `String removeVowel(String words)`
    3. Given a string, return a new string with all the vowels removed. For example, given `apple`, the method will return `ppl`.
4. `Function<Integer, Integer> getSquareFunction`
    5. Return a lambda that takes an argument and multiple it by itself. For example, given the argument is two, when I apply the function, it will return 4.
6. `Boolean isEquals(String object1, String object2)`
    7. Given two Strings, check to see if the content is the same. It is case sensitive. So given `"a"` and `"A"`, the method would return false.
        - If the two objects are null, then return true
        - If one object is null, but the other is not, then return false
        - If the content of the object is that same, then return true. Otherwise, return false.
