import java.io.File;
import java.io.FileInputStream;
public class Main {
    public static void main(String[] args) {
        try {
            File dosya = new File("deneme1.txt");
            dosya.createNewFile();// deneme 1 adı altında bir dosya olusturdu .
            FileInputStream input = new FileInputStream("deneme.txt"); // var olan deneme dosyasını okuyor
            System.out.println(input.read()); // tek bir tanesini okudu ve aski tablo degerini yazdırdı
            System.out.println(" karakter sayısı ;" +input.available()); // karakter sayısını ortaya koyuyor.
            /*
            hepsini okuması için sonsuz döngü olan while döngüşüne aldık .
            -1 sınıf içi bos olana kadar oku demek
             */
            int i = input.read();
            while (i  != -1){
                System.out.print((char)i);
                i = input.read();

            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}