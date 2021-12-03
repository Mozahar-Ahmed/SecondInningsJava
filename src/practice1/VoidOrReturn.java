package practice1;

public class VoidOrReturn {
    public static void main(String[] args) {
        printMyName();
        String myName = getMyName();
        System.out.println(myName);
        VoidOrReturn voidOrReturn = new VoidOrReturn();
        voidOrReturn.printMyAge();
        int myAge = voidOrReturn.getMyAge();
        int realAge = myAge + 2;
        System.out.println(realAge);
    }

    public static void printMyName() {
        System.out.println("Mozahar");
    }

    public static String getMyName() {
        return "Mozahar Ahmed";

    }

    public void printMyAge() {
        System.out.println(50);
    }

    public int getMyAge() {
        return 52;

    }
}
