import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileoutputstream {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream();

        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
