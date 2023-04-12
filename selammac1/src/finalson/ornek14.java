package finalson;
//Kendisine parametre olarak gelen stringin polindrome olup olmadığını geri döndüren metod.
public class ornek14 {
    public static  String polendurem(String a ){
        String str = "";
        for (int i = a.length()-1; i >=0 ; i--) {
            str = a.charAt(i) + str;

        }if(str.equals(a)) return "polendurem";
        else return "polendurum degil";
    }

    public static void main(String[] args) {
        System.out.println(polendurem("ada"));
    }
}
