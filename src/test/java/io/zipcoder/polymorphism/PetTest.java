package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void inheritanceTest() { //test inheritance. cat inherits from pet
        //Given expected outcome and what you need
        Pet cat = new Cat(); //to check inheritance, type is the parent class pet
        //When (testing method with the given)

        //Then what is the outcome
        Assert.assertTrue(cat instanceof Pet); //test if cat is instance of Pet returns true
    }

}
