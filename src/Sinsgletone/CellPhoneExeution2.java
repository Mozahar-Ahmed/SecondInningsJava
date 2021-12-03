package Sinsgletone;

public class CellPhoneExeution2 {
    public static void main(String[] args) {
        CellPhone cellPhone = CellPhone.getInstance();
        int price = cellPhone.getPrice();
        System.out.println(price);
    }
}
