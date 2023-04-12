package metotlars;
//Kendisine parametre olarak gelen tamsayı dizisindeki en büyük ikinci sayıyı geri döndüren method.
public class ornek20 {
    public  static  int enBuyuk2(int a []){
       int index =0 ,sayac =0 , max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max){
                max = a[i];
                sayac =0;
                index =i;
            }if( a[i] == max){
                if(sayac<2) {
                    index = i;
                    sayac++;
                }
            }
        }
        return  a[index];
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        System.out.println(enBuyuk2(a));
    }
}
