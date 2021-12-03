package practice1;

public class AccessSpcifier {
    //need for class, variable, method
    // public --> everywhere
    // private --> same class
    // default --> same package & different package's subclass
    // protected --> same package

    public static String pub = "Anywhere";
    protected static String proc = "Within the package only";
    private static String pvt = "SameClass";

    protected static void testSpecifier() {
        System.out.println("Its a protected method");
    }

    private static void testSpecifier1() {
        System.out.println("Its a private method");
    }

    static void testSpecifier2() {
        System.out.println("Its a default method");
    }

    public static void testSpecifier3() {
        System.out.println("Its a public method");
    }

    public static void main(String[] args) {
        testSpecifier();
        testSpecifier1();
        testSpecifier2();
        testSpecifier3();
        String def = "Package+subclass";// no specifier means default specifier
        System.out.println(def);
        System.out.println(pub);
        System.out.println(pvt);
        System.out.println(proc);
    }
}
