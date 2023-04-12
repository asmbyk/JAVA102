import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Main {
    /*

     */
    public static void main(String[] args) {
        File dosya = new File("deneme13.txt"); // Dosyamızı nesneye aldık .
        try {
            Scanner okuma = new Scanner(dosya); // scanner dosyayı okumak istiyor.
            if (!dosya.exists()) {
                System.out.println("dosyavar");
            }
            else {
                dosya.createNewFile();
            }
            while (okuma.hasNextLine()) {
                System.out.println(okuma.nextLine());

            }
        } catch (Exception e) { // try hata gercekleştigi zaman catch calısırr.
            System.out.println(e.getMessage());// hatayı gösterdik
            System.out.println("bir hata olustu.");
        }
    }
}