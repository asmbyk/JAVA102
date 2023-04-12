package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen klavyeden girildiği tamsayı kadar adınızı ekrana yazan programı yazınız.
 */
public class ornek3 {
    public  static  void isim(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("ahmet asım bıyıklı");
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        isim(a);
    }
}
