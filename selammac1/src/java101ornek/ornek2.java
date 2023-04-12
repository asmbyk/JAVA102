package java101ornek;

/*
   //Kendisine parametre olarak gelen iki tamsayının a^b sini hesaplayıp geri döndüren methodu yazınız.
 */
public class ornek2 {
    public static int usAl(int a, int b) {
        int fak = 1;
        for (int i = 1; i <= a; i++) {
            fak = i * fak;

        }
        return fak;
    }

    public static void main(String[] args) {
        System.out.println(usAl(3, 2));
    }
}
