import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        // Metin dosyasını açmaya çalış
        Scanner input = null;
        File dosya = new File(notlar.txt);
        try {

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı - " + e);

            return;
        }

        // Dosyadaki her bir ders için not ortalamasını hesapla
        while (input.hasNextLine()) {
            // Bir satır oku ve boşluklara göre ayır
            String line = input.nextLine();
            String[] parts = line.split(" ");

            // Ders adını ve öğrenci sayısını al
            String ders = parts[0];
            int ogrenciSayisi = Integer.parseInt(parts[1]);

            // Notları topla ve ortalama bul
            int toplam = 0;
            for (int i = 2; i < parts.length; i++) {
                toplam += Integer.parseInt(parts[i]);
            }
            double ortalama = (double) toplam / ogrenciSayisi;

            // Ders adı ve ortalama değerini ekrana yaz
            System.out.println(ders + " dersinin not ortalaması: " + ortalama);
        }

        // Dosyayı kapat
        input.close();
    }
}