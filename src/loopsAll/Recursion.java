package loopsAll;

public class Recursion {

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }


    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);

    }
}
