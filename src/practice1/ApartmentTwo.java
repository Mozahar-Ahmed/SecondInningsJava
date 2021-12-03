package practice1;

public class ApartmentTwo {
    public static void main(String[] args) {
        String lastYear = "2020";
        int previousYear = 2020;
        String number = "1";
        int anotherNumber = 1;

        String currentYear1 = lastYear + number;
        String currentYear2 = lastYear + anotherNumber;
        String currentYear3 = previousYear + number;
        int thisYear = previousYear + anotherNumber;

        System.out.println(currentYear1);
        System.out.println(currentYear2);
        System.out.println(currentYear3);
        System.out.println(thisYear);

        System.out.println("..........anotherway.............");

        System.out.println(lastYear + number);//string+string= apended string
        System.out.println(lastYear + anotherNumber);//string+ int= apended as string
        System.out.println(previousYear + number);//int + string= appended as string
        System.out.println(previousYear + anotherNumber);//int+int=int can do math (addition) for us

        int a = 100;
        int b = 200;
        int c = 300;
        int d = a + b + c;//storing the value in a similar (data type..int) container (reference variable...d)
        System.out.println(d);
        //System.out.println(a+b+c);
        int e = c - b;
        System.out.println(e);
        int f = a + b - c;
        System.out.println(f);
        int g = a * b;
        System.out.println(g);
        int h = c / a;
        System.out.println(h);

        double x = 1.5;
        double y = 1.7;
        double z = x + y;
        System.out.println(z);

        boolean isJavaHard = false;
        System.out.println(isJavaHard);

    }
}
