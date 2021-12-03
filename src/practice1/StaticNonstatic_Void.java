package practice1;

public class StaticNonstatic_Void {
    public StaticNonstatic_Void() {       //default constructor
    }

    public static void main(String[] args) {
        myName();//static method can go inside a static method
        //printMe();//non-static method can not go inside a static method ...it shows error
        StaticNonstatic_Void staticNonstaticVoid = new StaticNonstatic_Void();//need to create an object of that class
        staticNonstaticVoid.printMe();//to call a non static method inside a static method
    }

    public static void myName() {
        System.out.println("Mozahar");

    }

    public void myAge() {
        System.out.println("100");

    }

    public void myWeight() {
        System.out.println(172);

    }

    public void printMe() {
        myName();//static method can go inside a non-static method as well
        myAge();// but a non-static method can go inside another non-static method only
        myWeight();
    }
}
