package java101ornek;
/*
    //Kendisine parametre olarak gelen stringteki "a" karakterinin olup olmadığını geri döndüren metod.
 */
public class ornek15 {
    public  static  int abul(String a){
        int sayac =0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='a'){
                System.out.println("kelimede a karateri var");
                sayac ++;
            }else {
                System.out.println("kelimede a karakteri yok ");
            }
        }return sayac;
    }

    public static void main(String[] args) {
        System.out.println(abul("ahmet"));
    }
}
