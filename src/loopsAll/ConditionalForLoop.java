package loopsAll;

public class ConditionalForLoop {
    public static void main(String[] args) {
        //Using "==" (Equal)
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Lucky number for me: " + i);
            } else {
                System.out.println("Regular number " + i);
            }
        }
        //Using "!=" (not equal)
        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println("Ordinary!: " + i);
            } else {
                System.out.println("WoW!!! " + i);
            }
        }
        //Using "&&" (and)
        for (int i = 0; i < 5; i++) {
            if (i < 4 && i > 2) {
                System.out.println("Got it " + i);
            } else {
                System.out.println("Nope " + i);
            }
        }
        //Using "||" (or)
        for (int i = 0; i < 5; i++) {
            if (i == 3 || i > 4) {
                System.out.println("That's what I was expecting " + i);
            } else {
                System.out.println("Mismatched " + i);
            }
        }
    }
}
