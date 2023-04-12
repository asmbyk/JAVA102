package patika202;

import patika202.ExceptionHandling.ExceptionHandling1;

import java.io.File;
import java.io.IOException;

public class fileislemler {
    public static void main(String[] args) {
        File dizin = new File("test");
        dizin.mkdir();
        File dosya = new File("test/patika.txt");
        try{
            if(dosya.createNewFile()){
                System.out.println( dosya.getName() +"doya olusturuldu.");
            }else {
                System.out.println( dosya.getName() +"dosya zaten mevcut");
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        dosya.delete();

    }
}
