package java101ornek;
/*
    //Kendisne parametre olarak gelen tamsayı dizindeki her bir elemanı 1 arttırıp geri döndüren metod.
 */
public class ornek20 {
    public  static int[] birArti (int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i]= a[i] +1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 4, 5, 6};
        int b[] = birArti(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
