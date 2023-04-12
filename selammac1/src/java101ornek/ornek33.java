package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen 2 boyutlu string dizisi içindeki en uzun karakterlere sahip olan stringi ve indeksi geri döndüren metot
 */
public class ornek33 {
    public  static String index (String[][] a){
         int max =a[0][0].length();
         String bos = " ";
        int satir =0;
        int sutun =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j].length() > max){
                    max = a[i][j].length();
                    satir =i;
                    sutun =j;
                    bos = a[i][j];

                }
            }
        }return bos;
    }

    public static void main(String[] args) {
         String  a[][] = new String[2][3];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                a[i][j] = k.next();
            }
        }
        System.out.println(index(a));
    }
}
