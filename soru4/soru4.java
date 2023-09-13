import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class soru4 {

    // Ali.txt dosyasındaki sayılar içinde asal olanları bulup ASAL.txt dosyasına yazan metot
    void asalBulVeYaz() {
        try {

            File dosya = new File("Ali.txt");
            File dosya1 = new File("Asal.txt");


            if (!dosya.exists() || !dosya1.exists()) { // dosya varmı yokmu yoksa olustur.
                dosya.createNewFile();
                dosya1.createNewFile();
            } else {
                System.out.println("Dosya mevcut");
            }
            // Ali.txt dosyasını okumak için bir Scanner nesnesi oluştur
            Scanner k = new Scanner("Ali.txt");
            // ASAL.txt dosyasını yazmak için bir PrintWriter nesnesi oluştur
            PrintWriter writer = new PrintWriter(new File("ASAL.txt"));

            // Dosyadaki her bir sayı için
            while (k.hasNextInt()) {
                // Sayıyı oku
                int sayi = k.nextInt();

                // Sayının asal olup olmadığını kontrol etmek için bir boolean değişkeni tanımla
                boolean asal = true;

                // Sayının 2'den kendisine kadar olan bölenlerini dene
                for (int i = 2; i < sayi; i++) {
                    // Eğer sayı tam bölünüyorsa asal değildir
                    if (sayi % i == 0) {
                        asal = false;
                        break;
                    }
                }

                // Eğer sayı asalsa ASAL.txt dosyasına yaz
                if (asal) {
                    writer.println(sayi);
                }
            }

            // Scanner ve PrintWriter nesnelerini kapat
            k.close();
            writer.close();
        } catch (Exception e) { // genel hatalar için
            // Dosya bulunamazsa hata mesajı yaz
            System.out.println("Dosya bulunamadı - " + e);
        }
    }
}


