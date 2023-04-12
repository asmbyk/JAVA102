package cıkmıs;

import java.util.Scanner;

// klavyeden girilen 2 boyutlu stringte tek karaktere sahip olanı ekrana yazan metod
public class ornek3 {
    public  static  String bul(String a [][]){
        String str ="";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j].length()%2 ==1) str = str + " " + a[i][j];
            }
        }return  str;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a[][] = new String[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = k.next();
            }
        }
        System.out.println(bul(a));
    }
}
