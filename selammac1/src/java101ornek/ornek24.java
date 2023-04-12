package java101ornek;

import java.util.Scanner;

/*
    //Vize ve final notlarının bulunduğu iki diziyi parametre olarak alıp öğrencilerin ortalamasını hesaplayıp
 */
public class ornek24 {
    public  static  double ortalama(double vize,double fin ){
        double ort  , vetki  ,fetki;
        vetki =  ((vize/100)*40);
        fetki = ((fin/100)*60);
        ort = vetki + fetki;
        return ort;

        }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
         double a = k.nextDouble();
         double b = k.nextDouble();
        System.out.println(ortalama(a,b));
    }
    }

