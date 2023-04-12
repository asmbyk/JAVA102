import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    1 ile 100 arası sayıları dosyaya yazan uygulama
     */
    public static void main(String[] args) {
        File dosya = new File("sayilar.txt"); // dosyanın adı sayiler olsun

        PrintWriter p = null;

        try {

            if (!dosya.exists()) // dosya yok ise dosyayı olustur

                dosya.createNewFile();

            else

                System.out.println("Dosya mevcut"); // dosya var ise dosya mevcut

            p = new PrintWriter(new FileOutputStream(dosya, false)); // yazma sınıfı ac sonradan üstüne ekleme istemedigimiz için false
// p artık bir dosya akıs streami oldu
            Random rnd = new Random(); // random sınıfındaan rondom sayı üretmek için sınıfı rnd atatık

            for (int i = 1; i < 50; i++) {

                int sayi = rnd.nextInt(100); // sayi 100 kadar 50 tane random rakam olusturduk

                p.println(sayi); // dosyaya yazdık

            }

            p.close(); // dosya yazma modunu kapattık

            Scanner oku = new Scanner(dosya); // okuma modunu actık dosya  oku dedik

            int i = 1, enk = 100;

            while (oku.hasNext()) { // byte byte okudugu için sonsuz döngü aldık.

                int sayi = oku.nextInt();

                System.out.print(sayi + "\t"); // doayadaki sayları okuttuk

                if (i == 1) enk = sayi;

                if (sayi < enk) enk = sayi;

                i++; ,77  //büyük küçük belirledik

                if (i % 10 == 0) System.out.println("");

            }

            System.out.println("\n en küçük sayı:" + enk);

            oku.close(); // okuma dosyayı kapattık.

        } catch (Exception e) {

        }

    }
}
