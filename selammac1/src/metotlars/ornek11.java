package metotlars;
//Kendisne parametre olarak gelen iki stringteki büyük olanı geri döndüren metod.

public class ornek11 {
public  static String buyukStr(String a , String b){
    if(a.length()<b.length()) return b;
    else return a;
}

    public static void main(String[] args) {
        String a = "Ahmet asım";
        String b = "mehmet";
        System.out.println(buyukStr(b,a));
    }
}
