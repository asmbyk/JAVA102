package java101ornek;
/*
    //Kendisine parametre olarak gelen stringteki kelimeyi ters çevirip geri döndüren metodu yazınız.
 */
public class ornek9 {
public  static  String tersCevir( String a ) {
    String selam= "";
    for (int i = a.length()-1; i>=0 ; i--) {
        selam  = selam + a.charAt(i) ;

    }return selam;
}

    public static void main(String[] args) {
        String a = "Ahmet Bıyıklı";
        System.out.println(tersCevir(a));
    }
}
