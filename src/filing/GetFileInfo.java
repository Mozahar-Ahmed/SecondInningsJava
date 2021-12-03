package filing;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\13135\\Documents\\javafilling\\randomfile.txt");
        if (file.exists()) {
            System.out.println("File name is: " + file.getName());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println("Absolute file path is: " + file.getAbsolutePath());

        } else {
            System.out.println("File is not exist");
        }
    }
}
