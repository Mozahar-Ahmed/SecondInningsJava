package homeworks;

public class ParameterizedConstructor {
    String brand;
    int price;
    String color;

    public ParameterizedConstructor(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public ParameterizedConstructor(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor("iphone11", 11000);
        System.out.println(parameterizedConstructor.brand);
        System.out.println(parameterizedConstructor.price);
        ParameterizedConstructor pc = new ParameterizedConstructor("Samsung", 10000, "Olive");
        System.out.println(pc.brand + " " + pc.price + " " + pc.color);
    }

}
