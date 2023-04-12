package java101ornek;

import java.util.Scanner;

/*
    //n. fibonacci sayısını geri döndüren method yazınız.
 */
public class ornek5 {
public static int fibo (int n ){
    int  a =0 , b = 1 , c = 0;
    for (int i = 2; i <=n ; i++) {
        c = a +b;
        a = b;
        b =c;
    }
    return c ;
}

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        System.out.println(fibo(n));
    }
}
