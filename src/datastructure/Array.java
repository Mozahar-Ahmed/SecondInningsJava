package datastructure;

public class Array {
    public static void main(String[] args) {
        String[] name = {"ABC", "XYZ", "PQR"};
        System.out.println(name[1]);

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        String names[] = new String[4];
        names[0] = "Dham";
        names[1] = "Sham";
        names[2] = "Jodhu";
        names[3] = "Modhu";
        System.out.println(names[3]);

        Object everything[] = {"String", 48212, true, 12.50};
        Object zipcode = everything[1];
        System.out.println(zipcode);

        for (int i = 0; i < everything.length; i++) {
            System.out.println(everything[i]);
        }

    }
}