package Oops.abstraction;

public class RunableCar extends Car implements VehicleIdea, VehicleIdea2 {
    @Override
    public void wheel() {
        System.out.println("A runnable car consists of four wheels");
    }

    @Override
    public void start() {
        System.out.println("It should start");

    }

    @Override
    public void stop() {
        System.out.println("It should stop");

    }

    @Override
    void gear() {
        System.out.println("Multiple gear to control speed");

    }

    @Override
    public void window() {
        System.out.println("Four widows");
    }

    @Override
    public void stearing() {
        System.out.println("Need a stearing to drive");
    }

}
