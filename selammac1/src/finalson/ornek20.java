package finalson;
//Kendisine parametre olarak gelen tamsayı dizisindeki en büyük ikinci sayıyı geri döndüren method.
public class ornek20 {
    public  static  int enbuyuk23(int a []){
        int max = a[0], sayac=0, index =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max) {
                max =a [i];
                index =i;
                sayac =0;

            }if(max == a [i]){
                if( sayac <2){
                    sayac++;
                    index =i;
                }
            }
        }return index;
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,10,9};
        System.out.println(enbuyuk23(a));
    }
}
