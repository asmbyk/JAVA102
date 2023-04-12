package finalson;
//Kendisne parametre olarak gelen tamsayı dizindeki her bir elemanı 1 arttırıp geri döndüren metod.
public class ornek18 {
    public  static int[] arttir(int a []){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]+1;
        }return a;
    }

    public static void main(String[] args) {
        int b[] = {1,2,3,4,5};
        int a[] = arttir(b);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+ " ");
        }
    }
}
