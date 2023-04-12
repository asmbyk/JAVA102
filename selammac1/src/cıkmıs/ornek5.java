package cıkmıs;

import java.util.Scanner;

// klavyeden rasgele sayılar giriliyor bu sayılar içinde 10 tane asal sayı girildiginde
// bu sayıları diziye atan ve dizideki en büyük sayıyı yazdıran progrma.
public class ornek5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int asaladet =0, sayac=0;
        int a [] = new int[10];
        while( sayac <10){
             int b = k.nextInt();
            for (int i = 2; i <b; i++) {
                if(b%i == 0) sayac ++;

            }
            for (int i = 0; i < asaladet; i++) {

            }

        }
    }
}
