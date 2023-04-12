package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen tamsayı dizisinin toplamını geri döndüren metod.
 */
public class ornek17 {
    public  static  int dizitopla( int a[]){
        int topla = 0;
        for (int i = 0; i < a.length; i++) {
            topla = a[i] + topla ;
        }
        return topla ;
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = k.nextInt();
        }
        System.out.println(dizitopla(a));
    }
}
