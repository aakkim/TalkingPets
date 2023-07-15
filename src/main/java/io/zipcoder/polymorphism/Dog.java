package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog() {
        super("Charlie"); //inheriting parent class Pet's name variable
    }

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "bark";
    }

}
