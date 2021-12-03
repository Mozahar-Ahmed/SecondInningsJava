package parameterization;

public class ConstructorParameterization {
    String phoneModel;
    int makeYear;
    String phoneColor;

    public ConstructorParameterization() {// default constructor

    }

    public ConstructorParameterization(String phoneModel, int makeYear) {//parameterized constructor
        this.phoneModel = phoneModel;
        this.makeYear = makeYear;
        System.out.println("My phone model is " + phoneModel + ", its make year is " + makeYear);
    }

    public ConstructorParameterization(String phoneColor, String phoneModel) {//parameterized constructor
        this.phoneColor = phoneColor;
        this.phoneModel = phoneModel;
        System.out.println("My phone color is " + phoneColor + " model is " + phoneModel);
    }

    public ConstructorParameterization(int makeYear) {//parameterized constructor
        this.makeYear = makeYear;
        System.out.println(makeYear);
    }


    public static void main(String[] args) {
        ConstructorParameterization constructorParameterization = new ConstructorParameterization
                ("Iphone11", 2021);
        //We can print this way as well
        System.out.println("My phone model is " + constructorParameterization.phoneModel + " of " + constructorParameterization.makeYear);
        ConstructorParameterization cp = new ConstructorParameterization("Olive", "Galaxy Note");
        ConstructorParameterization conPar = new ConstructorParameterization(2018);
        /*constructorParameterization.printMyPhone();
        cp.printMyPhone();
        conPar.printMyPhone();*/

    }
    /*public void printMyPhone(){
        System.out.println(phoneModel);
        System.out.println(makeYear);
        System.out.println(phoneColor);
    }*/

}
