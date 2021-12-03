package algorithompractice;

public class ReverseString {
    public static void main(String[] args) {
        String regularString = "Selenium";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(regularString);
        String reverseString = stringBuilder.reverse().toString();
        System.out.println("Regular string is : " + regularString);
        System.out.println("Reverse string is: " + reverseString);

    }
}
