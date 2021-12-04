package Oops.abstraction;

public class UpgradedCar extends Car implements VehicleIdea, VehicleIdea2 {
    void autoDriver() {
        System.out.println("It can drive without a human driver__Like Tesla Car");
    }


    @Override
    void gear() {
        System.out.println("Need gear");
    }

    @Override
    public void stearing() {
        System.out.println("Need stearing wheel");

    }

    @Override
    public void wheel() {
        System.out.println("Need a spare wheel");

    }

    @Override
    public void start() {
        System.out.println("Can start");

    }

    @Override
    public void stop() {
        System.out.println("Can stop");

    }

    @Override
    public void window() {
        System.out.println("5 window");

    }
}
