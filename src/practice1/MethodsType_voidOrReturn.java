package practice1;

public class MethodsType_voidOrReturn {
    // packagename : all lower case
    // ClassName : Starts with UpperCase and then goes CamelCase
    // variable/methodName : starts with lowerCase and then goes CamelCase
    // ConstructorName : Same name as class name --> Starts with UpperCase and then goes CamelCase

    //static void method
    public static void staticVoidMethod() {
        System.out.println("Give me a mug of coffee");

    }

    //static return type method
    public static String staticReturnTypeMethod() {
        return "coffee";

    }

    //non static return type method
    public static String nonStaticReturnTypeMethod() {
        return "bestCoffee";

    }

    public static void main(String[] args) {
        staticVoidMethod();
        String cup = staticReturnTypeMethod();
        System.out.println(cup);
        MethodsType_voidOrReturn methodsTypeVoidOrReturn = new MethodsType_voidOrReturn();
        methodsTypeVoidOrReturn.nonstaticVoidMethod();
        String anotherCup = methodsTypeVoidOrReturn.nonStaticReturnTypeMethod();
        System.out.println(anotherCup);


    }

    //non static void method
    public void nonstaticVoidMethod() {
        System.out.println("I like coffee");

    }
}
