package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen iki boyutlu String dizisi içindeki en uzun stringi geri döndüre metod.
public class ornek26 {
    public static  String enUzun2 (String a [][]){
        int max = a[0][0].length();
        String Str = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j].length()>max){
                    max = a[i][j].length() ;
                    Str = a[i][j];
                }
            }
        }return Str;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String  a [][] = new String[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = k.next();
            }
        }
        System.out.println(enUzun2(a));
    }
}
