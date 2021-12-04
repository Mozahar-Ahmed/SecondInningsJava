package Oops.abstraction;

public class CarmanufacturerOne extends RunableCar implements VehicleIdea, VehicleIdea2 {
    public static void main(String[] args) {
        CarmanufacturerOne cmOne= new CarmanufacturerOne();
        cmOne.brake();
        cmOne.gear();
        cmOne.horn();
        cmOne.light();
        cmOne.start();
        cmOne.stearing();
        cmOne.stop();
        cmOne.wheel();
        cmOne.window();

    }
}
