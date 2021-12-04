package Oops.inheritance;

public class Car extends Vehicle {
    private String model = "CR-V";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        myCar.run();
        String carBrand = myCar.brand;
        String carModel = myCar.model;
        System.out.println("My car brand is: " + carBrand + " " + "and model is: " + carModel);

    }

    private void run() {
        System.out.println("My car runs fast");
    }

}
