package java101ornek;
/*
    //Kendisine parametre olarak gelen 10 elemanlı tamsayı dizisini 1 sağa döndüren ve diziyi ana methoda geri döndüren metot !!

 */
public class ornek29 {
    public  static  int[] sagaKaydir(int a[]){
 int b[] = new int[10];
 a[9] = a[0];
        for (int i = 0; i < a.length-1; i++) {
            a[i+1] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,7,8,9,10,11};
        int ab[] = sagaKaydir(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(ab[i]);
        }
    }
}
