package metotlars;

import java.util.Scanner;

//Kendisine parametre olarak gelen klavyeden girildiği tamsayı kadar adınızı ekrana yazan programı yazınız.
public class ornek3 {
    public  static  void adsoyad(int b ){
        for (int i = 0; i < b; i++) {
            System.out.println("ahmet asım bıyıklı");
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner( System.in);
        int b = k.nextInt();
        adsoyad(b);
    }
}
