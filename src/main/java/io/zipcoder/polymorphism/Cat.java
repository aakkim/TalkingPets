package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat() {
        super("Charlie"); //inheriting parent class Pet's name variable
    }

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "meow";
    }
}
