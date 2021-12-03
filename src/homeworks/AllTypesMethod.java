package homeworks;

public class AllTypesMethod {

    //void

    // static
    public static void getCost() {
        System.out.println("It cost dollar 10000");

    }//non-static

    public static int Cost() {
        return 12000;

    }//non-static

    public static void main(String[] args) {

        AllTypesMethod allTypesMethod = new AllTypesMethod();

        getCost();

        allTypesMethod.getPrice();

        int basicCost = Cost();
        System.out.println(basicCost);

        int retailPrice = allTypesMethod.price();
        System.out.println(retailPrice);

        allTypesMethod.cellCost(14000);//Parameterized void method

        int wholesalePrice = allTypesMethod.phoneCost(15000);// parameterized return type method
        System.out.println(wholesalePrice);

    }

    public void getPrice() {
        System.out.println("Its price dollar 11000");

        //return type
    }//static

    public int price() {
        return 13000;

        // parameterized method (Non-static only)

    }//void parameterized

    public void cellCost(int uniqueCost) {
        System.out.println(uniqueCost);

    }//return type parameterized

    public int phoneCost(int unitCost) {
        return unitCost;
    }

}
