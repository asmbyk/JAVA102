import  java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] dizi ={1,2,10,3,56};
         ByteArrayInputStream input = new ByteArrayInputStream(dizi);
         // 2 constare var nereden başlayacagını söylebiliriz. ve 3 parametre neden bitecegiini söylebiliriz. ofset ve lenght
        System.out.println(input.read()); // ilk byte okur  bu dizide cıktı 1 ;
        int i  = input.read();
        //input.skip(2); 2 elamanı atla
        while(i != -1) {
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}