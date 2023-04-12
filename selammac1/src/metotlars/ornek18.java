package metotlars;
//Kendisne parametre olarak gelen tamsayı dizindeki her bir elemanı 1 arttırıp geri döndüren metod.
public class ornek18 {
    public  static  int[] diziarttir(int a []){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1 ;
        }return  a;
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int b [] =diziarttir(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
