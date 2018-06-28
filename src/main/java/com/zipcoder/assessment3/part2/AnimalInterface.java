package com.zipcoder.assessment3.part2;

import java.time.LocalDate;

public interface AnimalInterface {

    int CURRENT_YEAR = LocalDate.now().getYear();

    int getYearOfBirth();

    int getAge();

    public void eat(Food food);

}
