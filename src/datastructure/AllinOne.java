package datastructure;

public class AllinOne {
    public static void main(String[] args) {
        int[] zipcode = new int[3]; //you can declare an array in either of the way
        int zipcode2[] = {11111, 22222, 33333};//using primitive data type
        Object zipcode3[] = new Object[3];//using Object
        Integer[] zipcode4 = new Integer[3];

        for (int i = 0; i < zipcode2.length; i++) {
            System.out.println(zipcode2[i]);
        }
        zipcode3[0] = 77777;
        zipcode3[1] = "A dog";
        zipcode3[2] = 12.5;
        for (int i = 0; i < zipcode3.length; i++) {
            System.out.println(zipcode3[i]);
        }

    }
}
