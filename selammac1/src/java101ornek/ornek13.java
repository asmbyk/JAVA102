package java101ornek;

import java.util.Scanner;
import java.util.SimpleTimeZone;

/*
    //Kendisne parametre olarak gelen iki stringteki büyük olanı geri döndüren metod.
 */
public class ornek13 {
    public  static  String buyukStr (String a, String b ){
        if (a.length() > b.length()) {
            System.out.println("büyük olan string" + a);
            return a;
        } else if (a.length() == b.length() ) {
            System.out.println("iki deger bibirine eşir");

        }else {
            System.out.println("büyük olan string" + b);
        }return b  ;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        String a = k.next();
        String b = k.next();
        buyukStr(a,b);
        }
    }


