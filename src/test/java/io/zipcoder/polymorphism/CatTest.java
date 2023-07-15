package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest() {
        //Given expected outcome and what you need
        String expected = "meow";
        Cat cat = new Cat();
        //When (testing method with the given)
        String actual = cat.speak();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given expected outcome and what you need
        String expected = "Charlie";
        Cat cat = new Cat();
        //When (testing method with the given)
        String actual = cat.getName();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given expected outcome and what you need
        String expected = "Charlie";
        Cat cat = new Cat();
        //When (testing method with the given)
        cat.setName(expected);
        String actual = cat.getName();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }
}
