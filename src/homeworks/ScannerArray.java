package homeworks;

import java.util.Random;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        // from the user, take 5 food they likes
        // give them a random food to eat
        System.out.println("Print five food of your choice one by one here: ");
        String foods[] = new String[5];
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            foods[i] = scanner.next();
        }
        System.out.println("Your today's food is ");
        Random random = new Random();
        int i = random.nextInt(foods.length - 1);
        System.out.println(foods[i]);


    }


}
