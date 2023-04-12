package java101ornek;

import java.util.Scanner;

/*
    //Kendisine parametre olarak gelen stringteki küçük karakterleri büyük yapan sonucu geri döndüren metodu yazınız.
 */
public class ornek10 {
    public static String kucukToBuyuk(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                str += (char) (s.charAt(i) - 32);
            } else {
                str = str + s.charAt(i);
            }

        }return str;
    }


    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a = k.next();
        String b = kucukToBuyuk(a);
        System.out.println(b);
    }
}
