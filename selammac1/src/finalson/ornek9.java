package finalson;
//Kendisine parametre olarak gelen stringteki kelimeyi ters çevirip geri döndüren metodu yazınız.
public class ornek9 {
    public static  String cevir(String a ){
        String str = "";
        for (int i = a.length()-1; i >=0 ; i--) {
            str = str+a.charAt(i);

        }return str;
    }

    public static void main(String[] args) {
        System.out.println(cevir("ahmet"));
    }
}
