package parameterization;

public class ReturnTypeMethodParam {

    // create 2 calculators
    // - one of them  will do addition of given 3 int
    // - another will do multiplication of given 2 int

    public static int calculator(int a, int b, int c) {
        int d = a + b + c;
        //System.out.println(d);//We can give print line here/not
        return d;


    }

    public static int calculator(int a, int b) {
        int c = a * b;
        //System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        int addition = calculator(5, 20, 30);
        int multiplication = calculator(3, 5);
        System.out.println("Sum of the numbers is: " + addition);//we can print it here also
        System.out.println("Result is :" + multiplication);

        //We can print directly here as well like this but this is not the company standard practice
        //System.out.println("Math result: "+calculator(10, 20, 30));
    }
}
