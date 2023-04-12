import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    // ögrencinin notu klavyeden okunacak , klavyeden okuyanan ögrenci isim vize final ortalama hesapla ve ögrencini geciyorsa
    //gecen.txt kalıyorsa kalan.txt yzılacak.
    public static void main(String[] args) {
        File d1= new File("kalan.txt");
        File d2 = new File("gecen.txt");
        try{
            if(!d1.exists()) d1.createNewFile();
            if(!d2.exists()) d2.createNewFile();
            Scanner oku = new Scanner(System.in);
            System.out.println("Adınızı vize ve final bilginizi giriniz");
             String isim = oku.nextLine();
             int vize = oku.nextInt();
             int finals = oku.nextInt();
             double ort = vize*0.4 +finals*0.6;
             if(ort >= 50 ) {
                 PrintWriter p = new PrintWriter(new FileOutputStream(d2,true));
                 p.println(isim +" " + vize+" " + finals + " " + ort);
                 p.close();
             }else {
                 PrintWriter p = new PrintWriter(new FileOutputStream(d1,true));
                 p.println(isim +" " + vize+" " + finals + " " + ort);
                 p.close();

             }
        }catch (Exception e){

        }
    }
}