package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen string dizisindeki en uzun stringin indisini geri döndüren metod.
public class ornek19 {
    public  static  int enUzunStrInd(String a []){
        int index =0;
        int max= a[0].length();
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()> max) {
                max = a[i].length();
                index =i;
            }
        }
        return  index ;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a[] = new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = k.next();
        }
        System.out.println(enUzunStrInd(a));
    }
}
