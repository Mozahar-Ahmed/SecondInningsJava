package Sinsgletone;

public class Laptop {
    //Declaration of Private static object of the class (half way)
    private static Laptop laptop = null;
    String color = "Coral Blue";

    //Private default constructor
    private Laptop() {

    }

    //Public static method which has return type of the class (object)
    public static Laptop getInstance() {
        if (laptop == null) {
            laptop = new Laptop();
        }
        return laptop;
    }

    public String getModel() {
        return "HP Pavilion";
    }

    public int getMakeYear() {
        return 2020;
    }
}
