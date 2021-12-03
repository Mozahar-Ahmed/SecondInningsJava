package Sinsgletone;

public class LaptopExecution {


    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        String laptopColor = laptop.color;
        System.out.println(laptopColor);
        String model = laptop.getModel();
        System.out.println(model);

    }

}
