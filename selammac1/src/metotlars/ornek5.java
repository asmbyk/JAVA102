package metotlars;

import java.util.Scanner;

//n. fibonacci sayısını geri döndüren method yazınız.
public class ornek5 {
    public  static  int fiboBul(int n){
        if(n<=0) return n;
        int a =0, b =1 ,c =0;
        for (int i = 2; i <=n ; i++) {
c= a +b;
a=b;
b=c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        System.out.println(fiboBul(a));
    }

}
