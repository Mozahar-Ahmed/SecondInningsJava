package parameterization;

public class ReturnTypeMethodParam2 {

    public static String calculator(String machineUsed) {
        //System.out.println(machineUsed);
        return machineUsed;
        // String anotherBrand="Ericson";//unreachable statement..intellij
    }

    public static int calculator(int count) {
        // System.out.println(count);
        return count;
    }

    public static int calculator(int x, int y) {
        return x / y;
        //int z = x/y;
        //return z;
    }

    public static void main(String[] args) {
        String machine = calculator("Simple calculator");
        System.out.println(machine);

        int digit = calculator(777);
        System.out.println(digit);

        int divisionResult = calculator(5000, 100);
        System.out.println(divisionResult);

        ReturnTypeMethodParam2 returnTypeMethodParam2 = new ReturnTypeMethodParam2();

        int addition = returnTypeMethodParam2.calculator(1000, 200, 300);
        System.out.println(addition);
    }

    public int calculator(int a, int b, int c) {
        int d = a - b + c;
        //System.out.println(a - b + c);
        //System.out.println(d);
        return d;
        //return a-b+c;
    }

}
