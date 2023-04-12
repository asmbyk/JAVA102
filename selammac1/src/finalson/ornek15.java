package finalson;

import java.util.Scanner;

//Kendisine parametre olarak gelen tamsayı dizisinin toplamını geri döndüren metod.
public class ornek15 {
    public  static  int topla (int a []){
        int toplam=0;
        for (int i = 0; i < a.length; i++) {
            toplam = a[i]  + toplam;
        }return  toplam;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a [] = new int[5];
        for (int i = 0; i < 5; i++) {
            a [i] = k.nextInt();
        }
        System.out.println(topla(a));

    }
}
