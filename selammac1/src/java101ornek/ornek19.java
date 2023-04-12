package java101ornek;
/*
    //Kendisine parametre olarak gelen tamsayı dizisinin sıralı olup olmadığını geri döndüren metod.
 */
public class ornek19 {
    public static boolean sirali(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i + 1] || a[i] > a[i -1]) {
                return false;

            } else {
                return true;
            }
        }return  true;
    }

    public static void main(String[] args) {
        int a[]={2,3,5,6,7,8,9};
        System.out.println(sirali(a));
    }
}
