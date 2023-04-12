package finalson;
//Kendisine parametre olarak gelen stingteki kelime sayısını geri döndüren metod.
public class ornek12 {
    public  static int kellime ( String a ){
        int sayac =1;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') sayac ++;
        }return  sayac ;
    }

    public static void main(String[] args) {
        String a = "ahmet veli deli";
        System.out.println(kellime(a));
    }
}
