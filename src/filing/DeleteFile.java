package filing;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\13135\\Documents\\javafilling\\filename.txt");
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
