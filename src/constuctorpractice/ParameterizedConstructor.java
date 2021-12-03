package constuctorpractice;

public class ParameterizedConstructor {
    int x;

    public ParameterizedConstructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor(123);
        System.out.println(pc.x);
    }
}
