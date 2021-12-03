package Sinsgletone;

public class CellPhone {
    private static CellPhone cellPhone = null;

    private CellPhone() {

    }

    public static CellPhone getInstance() {
        if (cellPhone == null) {
            cellPhone = new CellPhone();
        }
        return cellPhone;
    }

    public String getBrand() {
        return "Iphone";
    }

    public String getModel() {
        return "Iphone 11 pro max";
    }

    public int getPrice() {
        return 1100;
    }

}
