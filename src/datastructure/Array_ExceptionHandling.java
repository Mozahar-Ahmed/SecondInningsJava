package datastructure;

public class Array_ExceptionHandling {//Exception handling

    public static void main(String[] args) {
        String[] names = {"David", "Sam", "Nancy", "Hog"};
        try {
            System.out.println(names[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception that occured is " + e);
            e.printStackTrace();
        }

        System.out.println(names[3]);

        String cars[] = new String[5];
        cars[0] = "Toyota";
        cars[1] = "Honda";
        cars[2] = "Tesla";
        System.out.println(cars.length);
        String[] myCars = cars.clone();
        System.out.println(myCars.length);
        System.out.println(myCars[2]);

    }


}
