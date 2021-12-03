package variableCallFromOtherClass;

public class TokyoOlympic {
    // static --> keyword
    // 1. static method/variable --> can go inside static method or non static method,
    // if in the same class it can go directly , but if in different class we need to
    // specify name of the class.method/variable name;

    // 2. non-static method/variable --> can go inside non-static method in the same class directly
    // if we still have to call non-static methods/variables inside static method, we should create Objects of the class
    // SamE CLASS OR DIFFERENT CLASS

    public static void main(String[] args) {
        System.out.println(China.eventName);
        System.out.println(Usa.eventName);
        China china = new China();
        System.out.println("Chinese player " + china.competitorName);
        System.out.println(china.competitorAge);
        Usa usa = new Usa();
        System.out.println("American player " + usa.nameOfcompetitor);
        System.out.println(usa.ageOfCompetitor);
    }
}
