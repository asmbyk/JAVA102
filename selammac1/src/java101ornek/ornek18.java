package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen tamsayı dizisindeki en küçük teriminin indsini geri döndüren metod.
 */
public class ornek18 {
    public  static  int indexBul(int a[]){
        int index =0,  min = a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<min){
                min = a[i];
                index = i;
            }
        }return index ;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner( System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = k.nextInt();
        }
        System.out.println(indexBul(a));
    }
}
