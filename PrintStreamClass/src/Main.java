import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        // print sistemler hata vermiyor cecchk error kulanılır
        // System.out.println("Patika.Dev");
        // nesne üretmeden ulaştık static
        try {
            PrintStream output = new PrintStream("patika.txt");
            output.print(1231313);
            output.close();
        } catch (Exception e) {
            e.getMessage();
        }


    }
}