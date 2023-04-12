
package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu geri döndüren methodu yazınız.
public class ornek4 {
    public static int kacBasamak1(int a) {
  int sayac =1;
        while (a >10){
      a= a/10;
      sayac ++;
  }
return  sayac;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        System.out.println(kacBasamak1(a));
    }

}
