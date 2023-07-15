package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void speakTest() {
        //Given expected outcome and what you need
        String expected = "naeeeee";
        Horse horse = new Horse();
        //When (testing method with the given)
        String actual = horse.speak();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given expected outcome and what you need
        String expected = "Charlie";
        Horse horse = new Horse();
        //When (testing method with the given)
        String actual = horse.getName();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given expected outcome and what you need
        String expected = "Charlie";
        Horse horse = new Horse();
        //When (testing method with the given)
        horse.setName(expected);
        String actual = horse.getName();
        //Then what is the outcome
        Assert.assertEquals(expected, actual);
    }

}
