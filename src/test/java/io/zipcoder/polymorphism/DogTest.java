package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        //Given expected outcome and what you need
        String expected = "bark";
        Dog dog = new Dog();
        //When (testing method with the given)
        String actual = dog.speak();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given expected outcome and what you need
        String expected = "Charlie";
        Dog dog = new Dog();
        //When (testing method with the given)
        String actual = dog.getName();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given expected outcome and what you need
        String expected = "Charlie";
        Dog dog = new Dog();
        //When (testing method with the given)
        dog.setName(expected);
        String actual = dog.getName();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

}
