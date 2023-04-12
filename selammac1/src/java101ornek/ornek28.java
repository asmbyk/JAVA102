package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen 3*3 lük A ve B matrislerinin toplamını geri döndüren method.
 */
public class ornek28 {
    public  static  int topla ( int a[][]){
        int topla =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                topla = a[i][j] + topla ;
            }
        }return topla ;
    }

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = k.nextInt();
            }
        }
        System.out.println(topla(a));
    }
}
