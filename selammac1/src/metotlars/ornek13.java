package metotlars;
//Kendisine parametre olarak gelen stringteki "a" karakterinin olup olmadığını geri döndüren metod.
public class ornek13 {
    public  static  String aBul(String a){
        int sayac =0;
        String c = "a vardır";
        String b = "a yoktur";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)== 'a') sayac++;

        }if(sayac>0) return c;
        else return b;
    }

    public static void main(String[] args) {
        String kel = "merh";
        System.out.println(aBul(kel));
    }
}
