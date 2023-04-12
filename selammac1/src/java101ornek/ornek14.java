package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen stingteki kelime sayısını geri döndüren metod.
 */
public class ornek14 {
    public  static  int kelimeSay( String a ) {
        int sayac =1;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' '){
                sayac ++;
            }
        }return  sayac;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        System.out.println(kelimeSay(a));
    }
}
