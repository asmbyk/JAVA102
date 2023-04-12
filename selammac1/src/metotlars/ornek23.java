package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki en büyük sayıyı geri döndüren metod.
public class ornek23 {
    public  static  int twoarray(int a [][]){
        int max =  a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] > max) max = a[i][j];
            }
        }return  max ;
    }

    public static void main(String[] args) {
    int a[][] = new int[2][3];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] =k.nextInt();
            }
        }
        System.out.println(twoarray(a));
    }
}
