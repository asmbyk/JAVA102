package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu geri döndüren methodu yazınız.
 */
public class ornek4 {
    public static int kacBasamak(int a){
        int sayac =0 ;
        while (a>0){
            a = a /10;
            sayac ++;
        }return  sayac ;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        System.out.println(kacBasamak(a));
    }
}
