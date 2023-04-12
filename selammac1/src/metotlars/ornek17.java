package metotlars;
//Kendisine parametre olarak gelen tamsayı dizisinin sıralı olup olmadığını geri döndüren metod.
public class ornek17 {
    public  static  boolean siraordegil (int a[]){
        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[i-1] && a[i] > a[i-1]) return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {6,5,4,3,2,1};
        System.out.println(siraordegil(a));
    }
}
