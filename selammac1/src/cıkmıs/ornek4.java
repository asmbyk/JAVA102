package cıkmıs;

import java.util.Scanner;

// klavyeden girilen sayılar içinde sıfır sayısı girildiginde o ana kadar girilen sayıları toplayıp ekrana yazan
//bu işlemi 10 kez tekrarlayan program.
public class ornek4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac =0, toplam =0;

        while(sayac<10){
            int a = k.nextInt();
            toplam = a + toplam;
            if(a==0){
                System.out.println(toplam);
                sayac ++;
            }
        }
    }
}
