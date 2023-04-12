package metotlars;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen iki tamsayının toplamını geri döndüren metodu yazınız.
 */
public class ornek1 {
    public  static  int topla (int a ,int b){
        int toplam =0;
        toplam = a + b;
        return toplam;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner( System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        System.out.println(topla(a,b));
    }
}
