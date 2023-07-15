package io.zipcoder.polymorphism;

public class Horse extends Pet {

    public Horse() {
        super("Charlie"); //inheriting parent class Pet's name variable
    }

    public Horse(String name) {
        super(name);
    }

    public String speak() {
        return "naeeeee";
    }

}
