import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NotHesaplama {

    public static void main(String[] args) {

        // Notlar.txt var dedik
        String dosyaAdi = "Notlar.txt";

        File dosya = new File(dosyaAdi);

        try {
            // Dosyayı okumak için bir Scanner nesnesi oluşturduk ve dosya yok ise dosya olsutrumasını sagladım

            Scanner okuyucu = new Scanner(dosya);
            if (!dosya.exists()) {
                dosya.createNewFile();
            } else {
                System.out.println("Dosya mevcut");
            }



            // Dosyayı  sonsuz döngü ile okudum
            while (okuyucu.hasNextLine()) {

                // Bir satırı oku ve dersin adını ve notları ayırmasını sagladım
                String satir = okuyucu.nextLine();
                String[] veri = satir.split(":");
                String dersAdi = veri[0];
                String[] notlar = veri[1].split(",");

                // Notları topla + ortalasını hesapladım
                int toplam = 0;
                for (String not : notlar) {
                    toplam += Integer.parseInt(not);
                }
                double ortalama = (double) toplam / notlar.length;

                // cıktıda yazım
                System.out.println(dersAdi + " dersi için not ortalaması: " + ortalama);
            }

            // Dosyayı kapat
            okuyucu.close();

        } catch (Exception e) {  // file hata degilde genel bir hata olması için exectpien e aldım
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        }

    }

}
