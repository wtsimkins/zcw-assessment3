# Part 3 - Generics
A `Shelter` is a generic class that holds Objects that extends `Ageable`. For example, if a Person and a Dog extends Ageable, then I can declare the following:

```
Shelter<Person> farmHouse = new Shelter<Person>();
Shelter<Dog> dogHouse = new Shelter<Dog>();
```

1. Uncomment `src/test/java/com/zipcoder/assessment3/part3/ShelterTest.java`

Add the following methods:
1. `void add(T ager)` adds a new object to the shelter
2. `int size()` returns the number of object in the shelter
3. `removeFirst()` removed the first object added from the shelter and return it. If the shelter is empty, then return null.
4. `T getOldest` returns the oldest ageable object in the shelter. For example, if I add James who is 10, and John who is 15, then the method should return John.
