package Oops.polymorphism;

public class MethodOverriding extends MethodOverloading {
    public static void calculator() {
        System.out.println("This is child Class method");
    }

    public static void main(String[] args) {
        calculator();// Parent class method (calculator()) is override here by this child class method
    }
}
