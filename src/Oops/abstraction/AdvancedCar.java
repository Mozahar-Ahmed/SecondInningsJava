package Oops.abstraction;

public class AdvancedCar extends UpgradedCar {
    public static void main(String[] args) {
        AdvancedCar advancedCar = new AdvancedCar();
        advancedCar.autoDriver(); //Runtime polymorphism/method overriding

    }

    void autoDriver() {
        System.out.println("You can have fun while driving");
    }
}
