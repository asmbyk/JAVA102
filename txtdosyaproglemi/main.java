import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            File dosya = new File("sayilar.txt"); // dosya adında bir degişkene dosya atattık.
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            File tekdosya = new File("tekler.txt");
            File ciftDoysa = new File("ciftler.txt");

            if (!tekdosya.exists()) tekdosya.createNewFile();
            if (!ciftDoysa.exists()) ciftDoysa.createNewFile();
            PrintWriter p1 = new PrintWriter("tekler.txt");
            PrintWriter p2 = new PrintWriter("ciftler.txt");
            PrintWriter p3 = new PrintWriter("sayilar.txt");
            Random rasgele = new Random();
            int sayi;
            for (int i = 0; i < 10; i++) {
                sayi = rasgele.nextInt();
                System.out.println(sayi);
                p3.println(sayi);

            }

            p3.close();
            Scanner oku = new Scanner(dosya);
            int okunan ;
            while(oku.hasNextInt()){
                okunan= oku.nextInt();
                if(okunan %2 ==0){
                    p2.println(okunan);
                }
                else {
                    p1.println(okunan);
                }
                p1.close();
                p2.close();
            }
        } catch (Exception e) {

        }

    }
}
