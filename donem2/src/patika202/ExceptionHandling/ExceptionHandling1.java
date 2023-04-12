package patika202.ExceptionHandling;

import java.util.Scanner;
public class ExceptionHandling1 {
    public static void main(String[] args) {
         System.out.println("program başladı ");
        int a = 0 ;
        int b = 20 ;

         /*
        System.out.println(b/a);
        System.out.println("program bitti"); // suan program hata alıyor
        */

        try {
            System.out.println("bölme işlemi başladı");
            System.out.println(b/a);
            System.out.println("bölme işllemni bitti"); // yazısı gözükmüyor hatadan sonra catch geçiyor .
        }catch (Exception e){
            System.out.println("hata yakalandı ");
        } finally {
            System.out.println("kesinlikle çalışacak  "); // data base actık vb kapatılması lazım .

        }
    }
}
