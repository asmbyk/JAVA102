package finalson;
//Kendisine parametre olarak gelen iki tamsayının a^b sini hesaplayıp geri döndüren methodu yazınız.
public class ornek2 {
    public static  int  ahmet ( int a , int b) {
        int ust = 1 ;
        for (int i = 1; i <=a ; i++) {
            ust = b *ust;
        }return  ust ;
    }

    public static void main(String[] args) {
        System.out.println(ahmet(2,4));
    }
}
