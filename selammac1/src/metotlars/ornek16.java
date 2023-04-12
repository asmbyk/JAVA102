package metotlars;
//Kendisine parametre olarak gelen tamsayı dizisindeki en küçük teriminin indsini geri döndüren metod.
public class ornek16 {
    public  static  int diziIndex(int[] a){
       int max = a[0] , index =0;
        for (int i = 0; i < a.length; i++) {
                if(a[i]<max) {
                    a[i] = max ; index =i ;
            }
        } return index;
    }

    public static void main(String[] args) {
        int a[] = {6,2,3,4,5,1,7};
        System.out.println(diziIndex(a));
    }
}
