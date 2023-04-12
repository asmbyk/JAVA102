package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen pozitif tamsayıya kadar olan sayıların toplamını hesaplayan rekürisf metodu
 */
public class ornek35 {
    public  static  int toplaaRef(int a) {

        if(a == 0){
            return 0;
        }else{
            return a+toplaaRef(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        System.out.println(toplaaRef(a));
    }
}
