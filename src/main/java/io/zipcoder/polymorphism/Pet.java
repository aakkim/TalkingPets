package io.zipcoder.polymorphism;

public abstract class Pet { //abstract class is an object/blueprint but CANNOT create objects

    private String name;

    public Pet() {

    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak(); // in abstract classes, methods are defined with no code in the body

}
