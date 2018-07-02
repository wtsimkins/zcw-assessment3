package com.zipcoder.assessment3.part3;

import org.junit.Assert;
import org.junit.Test;

public class ShelterTest {

    @Test
    public void testSize_forPerson(){
        Shelter<Person> shelter = new Shelter<Person>();
        Assert.assertEquals(0, shelter.size());


        shelter.add(new Person(2015));
        shelter.add(new Person(2016));
        shelter.add(new Person(2011));

        Assert.assertEquals(3, shelter.size());
    }


    @Test
    public void testGetSize_forBird(){
        Shelter<Bird> shelter = new Shelter<Bird>();
        Assert.assertEquals(0, shelter.size());

        for(int i = 0; i < 100; i++) {
            shelter.add(new Bird(i + 2000));
        }

        Assert.assertEquals(100, shelter.size());
    }

    @Test
    public void testRemoveFirst_forPerson(){
        Person person = new Person(1);

        Shelter<Person> shelter = new Shelter<Person>();
        shelter.add(person);
        shelter.add(new Person(4));

        Person actualPerson = shelter.removeFirst();

        Assert.assertEquals(person, actualPerson);
        Assert.assertEquals(1, shelter.size());
    }

    @Test
    public void testGetOldest_forPerson(){
        Person oldestPerson = new Person(2008);

        Shelter<Person> shelter = new Shelter<Person>();
        shelter.add(new Person(2015));
        shelter.add(new Person(2016));
        shelter.add(new Person(2011));
        shelter.add(oldestPerson);

        Person actualPerson = shelter.getOldest();

        Assert.assertEquals(oldestPerson, actualPerson);
    }


    @Test
    public void testRemoveFirst_forBird(){
        Bird bird = new Bird(1);

        Shelter<Bird> shelter = new Shelter<Bird>();
        shelter.add(bird);
        shelter.add(new Bird(11));
        shelter.add(new Bird(43));

        Bird actualBird = shelter.removeFirst();

        Assert.assertEquals(bird, actualBird);
        Assert.assertEquals(2, shelter.size());
    }

    @Test
    public void testGetOldest_forBird(){
        Bird oldestBird = new Bird(2008);

        Shelter<Bird> shelter = new Shelter<Bird>();
        shelter.add(new Bird(2015));
        shelter.add(new Bird(2016));
        shelter.add(new Bird(2011));
        shelter.add(oldestBird);

        Bird actualHorse = shelter.getOldest();

        Assert.assertEquals(oldestBird, actualHorse);
    }


    @Test
    public void testGetOldest_whenThereIsOnlyOne(){
        Bird oldestPerson = new Bird(2008);

        Shelter<Bird> shelter = new Shelter<Bird>();
        shelter.add(oldestPerson);

        Bird actualHorse = shelter.getOldest();

        Assert.assertEquals(oldestPerson, actualHorse);
    }


    @Test
    public void testGetFirst_whenthereIsNone(){
        Shelter<Bird> shelter = new Shelter<Bird>();

        Bird actualBird = shelter.removeFirst();

        Assert.assertNull(actualBird);
    }

    public class Person extends Ageable {
        public Person(int yearOfBirth){
            super(yearOfBirth);
        }
    }

    public class Bird extends Ageable{
        public Bird(int yearOfBirth){
            super(yearOfBirth);
        }
    }
}
