package java101ornek;

/*
    //Kendisine parametre olarak gelen pozitif tamsayının faktöriyelini geri döndüren methodu yazınız.
 */
public class ornek6 {
    public static int faktor(int a) {
        if (a < 0) {
            return a;

        }
        int fak = 1;
        for (int i = 1; i <= a; i++) {
            fak = fak * i;
        }
        return fak;
    }

    public static void main(String[] args) {
        System.out.println(faktor(4));
    }
}
