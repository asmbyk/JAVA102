package metotlars;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen iki tamsayının a^b sini hesaplayıp geri döndüren methodu yazınız.
 */
public class ornek2 {
    public  static   int ustal(int a , int b){
        int ust = 1;
        for (int i = 1; i <=b ; i++) {
ust = ust *a ;
        }
        return ust;

    }

    public static void main(String[] args) {
        Scanner k = new Scanner( System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        System.out.println(ustal(a,b));
    }
}
