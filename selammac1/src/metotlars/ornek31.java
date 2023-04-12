package metotlars;

import java.util.Scanner;

// Kendisine parametre olarak gelen 2 boyutlu string dizisi içindeki en uzun karakterlere sahip olan stringi ve indexini
public class ornek31 {
public  static  String strIndex(String a[][]){
    int satir=0, sutun =0 ;
    String str = "";
    int max = a[0][0].length();
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j].length()>max) {
                max = a[i][j].length();
                satir=i;
                sutun =j;
            }
        }
    }return a[satir][sutun] + " "+ satir + " " + sutun ;

}

    public static void main(String[] args) {
        String a [][] = new String[2][3];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = k.next();
            }
        }
        System.out.println(strIndex(a));
    }
}
