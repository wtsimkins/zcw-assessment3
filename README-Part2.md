# Part 2 - Interface & Abstract classes

### Animal
1. Uncomment the test in `src/test/java/com/zipcoder/assessment3/part2/AnimalTest.java`
2. Create a new class named `Animal`.
  1. `Animal` implements `AnimalInterface`
  2. `Animal` is an `Eater`
  3. Add a protected field `int yearOfBirth` in the `Animal class`
  4. Create a getter and setter for the `yearOfBirth`
  5. Add a constructor that takes an int. Set that int to the yearOfBirth field `Animal(int yearOfBirth)`
  5. Add a `void eat(Food food)` method. This method will call `food.consume()`
  6. Add an abstract method called `int getAge()`
  7. Run the `AnimalTest`. Everything should pass.

### Horse
1. Uncomment the test in `src/test/java/com/zipcoder/assessment3/part2/HorseTest.java`
2. Create a new class named `Horse`
  1. A `Horse` is an `Animal`
  2. Implement the horse age. A horse age is 6.5 times the human years. For example, one human years is 7 dogs years. To implement the dog age, I would return `(CURRENT_YEAR - getYearOfBirth()) * 7`.

### Chicken
1. Uncomment the test in `src/test/java/com/zipcoder/assessment3/part2/ChickenTest.java`
2. Create a new class named `Chicken`
  1. A `Chicken` is an `Animal`
  2. Implement the chicken age. A chicken age is 10 times the human years. For example, one human years is 7 dogs years. To implement the dog age, I would return `(CURRENT_YEAR - getYearOfBirth()) * 7`.
  3. Add a `String produce()` method. This method will return `"egg"`
