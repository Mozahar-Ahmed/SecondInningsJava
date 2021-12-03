package practice1;

public class StaticNonstatic_Return {
    public StaticNonstatic_Return() {       //default constructor
    }

    public static void main(String[] args) {
        String name = myName();//static method can go inside a static method
        System.out.println(name);
        StaticNonstatic_Return staticNonstatic_Return = new StaticNonstatic_Return();
        int age = staticNonstatic_Return.myAge();//now method is invoked by java but I can not see anything as there is no print line to show me the result of invoking on the console
        System.out.println("I am" + " " + age + " " + "years old");
        float weight = staticNonstatic_Return.myWeight();
        System.out.println(weight);

    }

    public static String myName() {
        return "Mozahar";
    }

    public int myAge() {
        System.out.println("Something");
        return 100;

    }

    public float myWeight() {
        return 172.55f;

    }

}
