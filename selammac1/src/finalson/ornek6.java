package finalson;
//Kendisine parametre olarak gelen pozitif tamsayının faktöriyelini geri döndüren methodu yazınız.
public class ornek6 {
    public  static  int fakbul( int a ){
        int fak = 1 ;
        for (int i = 1; i <= a; i++) {
fak = i*fak;
        }return fak;
    }

    public static void main(String[] args) {
        System.out.println(fakbul(5));
    }
}
