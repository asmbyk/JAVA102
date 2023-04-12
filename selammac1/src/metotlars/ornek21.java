package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen tamsayı dizisindeki en büyük ve en küçük sayıyı geri döndüren metod.
public class ornek21 {
    public  static String maxmindizi(int[] a) {
        int  max =a[0] , min = a [0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max) max = a[i];
            if (a[i]<min) min = a [i];
        }return  max + " "+ min;
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = k.nextInt();
        }
        System.out.println(maxmindizi(a));
    }
}
