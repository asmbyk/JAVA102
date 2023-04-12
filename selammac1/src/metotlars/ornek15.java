package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen tamsayı dizisinin toplamını geri döndüren metod.
public class ornek15 {
    public  static  int topDizi(int a[]){
        int toplam =0;
        for (int i = 0; i < a.length; i++) {
             toplam = a[i] + toplam;
        }return toplam;
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = k.nextInt();
        }
        System.out.println(topDizi(a));
    }
}
