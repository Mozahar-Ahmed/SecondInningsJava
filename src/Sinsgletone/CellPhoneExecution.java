package Sinsgletone;

public class CellPhoneExecution {
    public static void main(String[] args) {
        CellPhone cellPhone = CellPhone.getInstance();
        String brand = cellPhone.getBrand();
        System.out.println(brand);
        String model = cellPhone.getModel();
        System.out.println(model);
    }
}
