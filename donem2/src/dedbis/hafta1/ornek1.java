package dedbis.hafta1;

import java.util.Scanner;

public class ornek1 {
    public  static int faktorialbul(int a) {
        int f =1 ;
        for (int i = 1; i <= a; i++) {
            f= f*i;
        }return f ;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("klavyeden bir sayı gir");
        int a = k.nextInt();

        System.out.println(faktorialbul(a));
    }
}
