package loopsAll;

public class Condition {
    public static void main(String[] args) {

        //Using "&&" (and)
        int i = 5;
        if (i < 6 && i > 4) {
            System.out.println("This number is actually " + i);
        } else {
            System.out.println("Its not " + i);
        }
        //Using "&&" (and)
        int a = 5;
        if (a < 4 && a > 4) {
            System.out.println("Gotcha " + a);
        } else {
            System.out.println("Oops " + a);
        }

        int j = 5;
        if (j < 6 || j > 4) {
            System.out.println("What a digit! " + j);
        } else {
            System.out.println(j + " is not either less than 4 or greater than 6");
        }
        int k = 5;
        if (k < 6 || k > 6) {
            System.out.println("AWesome digit! " + k);
        } else {
            System.out.println(k + " Not the right one");
        }
        int b = 5;
        if (b < 4 || b > 6) {
            System.out.println("AWesome digit! " + b);
        } else {
            System.out.println("Expected other than " + b);
        }
    }


}
