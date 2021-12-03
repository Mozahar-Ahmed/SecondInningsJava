package filing;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\13135\\Documents\\javafilling\\filename.txt");
            fileWriter.write("This is a java programming practice intended to write something text in a file located in local folder. Something is written in the demo file");
            fileWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
