package metotlars;
//Kendisine parametre olarak gelen iki tamsayıdan büyük olanı geri döndüren methodu yazınız.
public class ornek7 {
    public  static  int buyukBul( int a , int b){
        if(a>b) return  a ;
        else return b;
    }

    public static void main(String[] args) {
        System.out.println(buyukBul(5,4));
    }
}
