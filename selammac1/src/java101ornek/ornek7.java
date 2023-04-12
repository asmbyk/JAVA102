package java101ornek;
/*
    //Kendisine parametre olarak gelen iki tamsayıdan büyük olanı geri döndüren methodu yazınız.
 */
public class ornek7 {
    public  static int  buyukBull(int a, int b){
        if (a>b){
            return a;
        } else if (a==b) {
            return a;
        }else {
            return  b;
        }
    }

    public static void main(String[] args) {
        System.out.println(buyukBull(3,4));
    }
}
