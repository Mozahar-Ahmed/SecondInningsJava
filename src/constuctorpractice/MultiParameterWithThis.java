package constuctorpractice;

public class MultiParameterWithThis {
    String make;
    String model;
    int year;

    public MultiParameterWithThis(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        MultiParameterWithThis mp = new MultiParameterWithThis("Honda", "CR-V", 2004);
        System.out.println("My car: " + mp.make + " " + mp.model + " " + mp.year);
    }
}
