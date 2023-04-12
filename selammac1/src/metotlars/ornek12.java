package metotlars;
//Kendisine parametre olarak gelen stingteki kelime sayısını geri döndüren metod.
public class ornek12 {
    public  static  int kelimeSay(String a ){
        int sayac  =0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') sayac ++;
        }
        return  sayac;
    }

    public static void main(String[] args) {
        String a = "Ahmet mehmet veli ";
        System.out.println(kelimeSay(a));
    }
}
