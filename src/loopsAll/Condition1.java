package loopsAll;

public class Condition1 {
    public static void main(String[] args) {

        boolean isRainyDay = true;
        if (isRainyDay != false) {
            System.out.println("Don't go outside 1");
        } else {
            System.out.println("PLay soccer");
        }
        if (isRainyDay == true) {
            System.out.println("Don't go outside 2");
        } else {
            System.out.println("PLay soccer");
        }
        if (isRainyDay) {
            System.out.println("Don't go outside 3");
        } else {
            System.out.println("PLay soccer");
        }
        boolean isASunnyDay = false;
        if (isASunnyDay) {
            System.out.println("Play around");
        } else {
            System.out.println("Stay at home");
        }

        String today = "Friday";
        if (today == "Sunday") {
            System.out.println("Have fun");
        } else if (today == "Saturday") {
            System.out.println("Get ready for having fun on next day");
        } else if (today == "Friday") {
            System.out.println("Come back early at home to chill");
        } else {
            System.out.println("Stay tuned at your work place");
        }
    }
}