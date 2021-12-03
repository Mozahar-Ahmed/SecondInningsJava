package algorithompractice;

public class ReverseString2 {
    public static void main(String[] args) {
        String regularString = "Automation";
        char[] modifiedString = regularString.toCharArray();
        for (int i = 0; i < modifiedString.length; i++) {//Printing the characters in a regular order
            System.out.print(modifiedString[i]);
        }
        System.out.println();

        for (int i = modifiedString.length - 1; i >= 0; i--) {// printing the characters in a reverse order
            System.out.print(modifiedString[i]);
        }
    }
}
