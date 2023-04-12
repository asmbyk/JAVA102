package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen 10 elemanlı tamsayı dizisindeki tek olanların ortalamasını geri döndüren metod.
 */
public class ornek32 {
    public static double ortlamaBul2(int a[]) {
        double ortlama =0 ;
                int sayac =0 ,topla =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 ==1){
                topla = a[i] + topla;
                sayac ++;
            }

        } ortlama = topla/sayac;
        return ortlama ;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = k.nextInt();
        }
        System.out.println(ortlamaBul2(a));
    }

}
