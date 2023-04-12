package metotlars;
//Kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki satır toplamı geri döndüren metod.

public class ornek25 {
    public static int[] satirToplm(int[][] a) {

int b[] = new int[a.length];
        for (int i = 0; i < 2; i++) {

            int top = 0 ;


            for (int j = 0; j < 3; j++) {
top = top+ a[i][j];
            }
            b[i] = top;
        }return  b;

    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};
        int b [] = satirToplm(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
