package java101ornek;

import java.util.Scanner;

/*
    //10 elemanlı 2 tam sayı dizisinin toplamını geri döndüren method.
 */
public class ornek30 {
    public  static  int topla (int a[], int b[] ){
       int topla=0 ;
        for (int i = 0; i < 10; i++) {
            topla = a[i] + b[i] + topla;
        }return  topla ;
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = k.nextInt();
            b[i] = k.nextInt();
        }
        System.out.println(topla(a,b));
    }
}
