package filing;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\13135\\Documents\\javafilling\\demofile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created:" + file.getName());
            } else {
                System.out.println("File is not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println("There is a mistake");
        }

    }
}
