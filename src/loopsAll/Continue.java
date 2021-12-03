package loopsAll;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i == 5) {
                continue;//Actually means skip at this point and continue thereafter
            }
            System.out.println(i);
        }
    }
}
