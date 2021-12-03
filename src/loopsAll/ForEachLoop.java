package loopsAll;

//for-each loop is used exclusively to loop through elements in an array
//Syntax of foreach loop is like below:
/*for (dataType variableName : arrayName) {
        // code block to be executed
        }*/
public class ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "Honda", "Toyota", "GMC"};
        for (String s : cars) {
            System.out.println(s);
        }
    }
}
