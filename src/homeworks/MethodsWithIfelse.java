package homeworks;

public class MethodsWithIfelse {
    static int checkAge(int age) {
        if (age < 18) {
            System.out.println("Acess denied - you are not old enough");
        } else {
            System.out.println("Access granted - you are old enough");
        }
        return age;
    }

    public static void main(String[] args) {
        checkAge(14);
    }
}
