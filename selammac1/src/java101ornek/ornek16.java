package java101ornek;

/*
    //Kendisine parametre olarak gelen stringin polindrome olup olmadığını geri döndüren metod.
 */
public class ornek16 {
    public static String polenromebul(String a) {
        String str = "";
        for (int i = a.length()-1; i >= 0; i--) {
            str = str + a.charAt(i);

        }
        if (a.equals(str)) {
            return "poliminom kelimedir.";
        } else {
            return " polimonom degildir.";
        }
    }

    public static void main(String[] args) {
        String a = "ada";
        System.out.println(polenromebul(a));
    }
}
