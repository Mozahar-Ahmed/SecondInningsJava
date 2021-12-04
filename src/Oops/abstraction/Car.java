package Oops.abstraction;

public abstract class Car extends Car2 { // we can extend abstract class to abstract class, but not more than one

    public Car() {// abstract class has constructor, still can't create obj

    }
    // methods that are abstract we need to specify as abstract
    abstract void gear();

    void horn() {
        System.out.println("A car should have a horn");
    }
}