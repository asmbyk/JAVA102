package finalson;
//Kendisne parametre olarak gelen iki stringteki büyük olanı geri döndüren metod.
public class ornek11 {
    public  static  String bul1(String a , String b){
        if(a.length() > b.length()) return  a;
        else if (a.length() == b.length()) return " eşittir";
        else return b;
    }

    public static void main(String[] args) {
        System.out.println(bul1("ahmet","velia"));
    }
}
