package constuctorpractice;

public class SetAttributeValue {
    /*Constructor can be used to set initial values for object attributes
       if you do not create a class constructor yourself, Java creates one for you.
        However, then you are not able to set initial values for object attributes*/
    int x;

    public SetAttributeValue() {
        x = 10;
    }

    public static void main(String[] args) {
        SetAttributeValue setAttributeValue = new SetAttributeValue();
        int y = setAttributeValue.x;
        System.out.println(y);
    }

}
