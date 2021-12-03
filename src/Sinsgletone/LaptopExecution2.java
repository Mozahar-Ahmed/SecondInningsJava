package Sinsgletone;

public class LaptopExecution2 {
    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        int year = laptop.getMakeYear();
        System.out.println(year);
    }
}
