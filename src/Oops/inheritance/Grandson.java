package Oops.inheritance;


public class Grandson extends Father {
    public static void main(String[] args) {
        Grandson grandson = new Grandson();
        grandson.grandFather();
        grandson.father();
        grandson.grandson();


    }

    public void grandson() {
        String name = "Bush Tiny";
        System.out.println(name);
        System.out.println("I am in the bottom layer");
    }
}
