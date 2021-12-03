package variableCallFromOtherClass;

public class LocalVsGlobal {
    static String vacuamCleaner = "Husky";//Global variable

    public static void main(String[] args) {
        bedroom();
        LocalVsGlobal localVsGlobal = new LocalVsGlobal();
        localVsGlobal.livingRoom();

    }

    public static void bedroom() {

        String freez = "Samsung";//Local variable
        System.out.println(freez);
        System.out.println(vacuamCleaner);
    }

    public void livingRoom() {
        String tv = "Bravia";
        System.out.println(tv);
        System.out.println(vacuamCleaner);
    }
}
