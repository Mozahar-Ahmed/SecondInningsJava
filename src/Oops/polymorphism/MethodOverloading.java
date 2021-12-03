package Oops.polymorphism;

public class MethodOverloading {
    public static void calculator() {
        System.out.println("This is parent class method");
    }

    public static void calculator(int a) {
        System.out.println(a);
    }

    public static void calculator(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void calculator(String x, int y) {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        calculator();
        calculator(10);
        calculator(10, 20);
        calculator("Lucky number", 7);
    }
}
