package parameterization;

import java.util.Scanner;


public class ScannerPractice {
    public static void main(String[] args) {
        talkToMachine();
        calculator();
    }

    public static void talkToMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.next();
        System.out.println("Your name is unique Mr. " + name);
        scanner.next();
        System.out.println("What is the meaning of your name?");
        scanner.next();
        System.out.println("Great!");
        System.out.println("How old are you Mr. Mozahar?");
        int age = scanner.nextInt();
        System.out.println("You look so young at the age of " + age);
        System.out.println("Thanks!");
        scanner.close();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number:");
        int secondNumber = scanner.nextInt();
        int mathResult = firstNumber + secondNumber;
        System.out.println("Addition result of given numbers is " + mathResult);

    }
}
