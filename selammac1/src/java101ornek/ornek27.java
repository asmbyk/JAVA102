package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen iki boyutlu String dizisi içindeki en uzun stringi geri döndüre metod.
 */
public class ornek27 {
    public  static  String enuzun (String a [][]){
        int max = a [0][0].length() ;
        String maxu = " ";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j].length() > max){
                     maxu = a[i][j];
                }
            }
        }return maxu ;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a[][] = new String[2][3];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = k.next();
            }
        }
        System.out.println(enuzun(a));
    }
}
