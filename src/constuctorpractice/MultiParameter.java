package constuctorpractice;


public class MultiParameter {
    String make;
    String model;
    int year;

    public MultiParameter(String carMake, String carModel, int modelYear) {
        make = carMake;
        model = carModel;
        year = modelYear;
    }

    public static void main(String[] args) {
        MultiParameter mp = new MultiParameter("Honda", "CR-V", 2004);
        System.out.println("My car: " + mp.make + " " + mp.model + " " + mp.year);
    }
}
