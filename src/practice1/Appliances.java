package practice1;

public class Appliances {
    public static void main(String[] args) {
        kitchen();
        //Appliances appliances = new Appliances();
        //appliances.microOven();
    }

    public static void kitchen() {
        String size = "Small Kitchen";
        System.out.println(size);
        Appliances appliances = new Appliances();
        appliances.microOven();
    }

    public void microOven() {
        String oven = "Nova";
        System.out.println(oven);
        burger();//a non static method can go inside another nonstatic method

    }

    public void burger() {
        String type = "Cheese Burger";
        System.out.println(type);
    }
}
