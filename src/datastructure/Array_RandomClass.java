package datastructure;

import java.util.Random;

public class Array_RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int roomNumber = random.nextInt(100);
        System.out.println("Room that sanctioned for you is " + roomNumber);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {  // 1st loop to generate random int in the array and fill all the index
            numbers[i] = random.nextInt(500);
        }
        for (int i = 0; i < 5; i++) { //2nd loop to print  all generated int from the array
            System.out.println(numbers[i]);
        }
    }
}
