package metotlars;

import java.util.Scanner;

//10 elemanlı 2 tam sayı dizisinin toplamını geri döndüren method.
public class ornek28 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a [] = new int[10];
        int b [] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = k.nextInt();
            b[i]  = k.nextInt();

        }
        System.out.println(dizitopla2(a,b));
    }public  static  int dizitopla2 ( int a[], int b[]){
        int toplam =0;
        for (int i = 0; i < 10; i++) {
            toplam = a[i] + b[i] + toplam;
        }
        return toplam;
    }
}
