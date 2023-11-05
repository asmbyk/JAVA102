import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        //bayt cinsindeki verileri daha verimli okumak için kulanılır
        try {
            FileInputStream fileInput = new FileInputStream("Patika.txt");
            BufferedInputStream buffInput  = new BufferedInputStream(fileInput);
            int i = buffInput.read();
            while (i !=-1){
                System.out.println((char) i);
                i = buffInput.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } // ayınısı output stream oluşturmak mümkün.
        //
    }
}