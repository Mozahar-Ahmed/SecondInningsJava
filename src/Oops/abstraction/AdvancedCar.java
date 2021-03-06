package Oops.abstraction;

public class AdvancedCar extends UpgradedCar {
    int model = 2025;

    public static void main(String[] args) {
        AdvancedCar advancedCar = new AdvancedCar();
        advancedCar.autoDriver(); //Runtime polymorphism/method overriding
        advancedCar.brake();     //this method overrides the previous method
        advancedCar.gear();
        System.out.println(advancedCar.model);//this will override the parent class attribute's value

        //you can call all the methods here that are belongs to the previous classes and interfaces
    }

    void autoDriver() {
        System.out.println("You can have fun while driving");
    }

    void brake() {
        System.out.println("Replaced with vacuum brake");
    }
}

