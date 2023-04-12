package finalson;
//Kendisine parametre olarak gelen stringteki küçük karakterlerin sayısını geri döndüren methodu yazınız.
public class ornek8 {
    public static  int ahmets(String a ){
        int sayac =0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>= 'a' && a.charAt(i)<= 'z') sayac ++;

        }return sayac;
    }

    public static void main(String[] args) {
        System.out.println(ahmets("Ahmet"));
    }
}
