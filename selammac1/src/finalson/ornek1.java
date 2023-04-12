package finalson;
//Kendisine parametre olarak gelen iki tamsayının toplamını geri döndüren metodu yazınız.
public class ornek1 {
     public  static  int topla( int a , int b){
         int toplam = a + b ;
         return  toplam ;
     }

    public static void main(String[] args) {
        System.out.println(topla(3,4));
    }
}
