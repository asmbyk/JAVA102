import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*

     */
    public static void main(String[] args) {
        File dosya = new File("karakter.txt");
        PrintWriter p = null;
        try {
            if ( !dosya.exists()){
             p = new PrintWriter(new FileOutputStream(dosya,false));
                Random rnd = new Random();
                for (int i = 1; i <1000 ; i++) {
                    char c =  (char)( rnd.nextInt(74)+'0');
                    p.print(c  +" ");
                    if(c%100 == 0) p.println();

                }
                p.close();
                Scanner oku  = new Scanner(dosya);
                while (oku.hasNext()) {
                    String okunan = oku.nextLine();
                    String dizi [] = okunan.split(" ");
                    for (int i = 0; i < dizi.length; i++) {
                        if(dizi[i].charAt(0) >= '0'&& dizi[i].charAt(0) <= '9')
                            System.out.println(dizi[i] + " ");
                    }
                }
            }
        }catch (Exception e){

        }

    }
}