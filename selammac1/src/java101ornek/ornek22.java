package java101ornek;
/*
    //Kendisine parametre olarak gelen tamsayı dizisindeki en büyük ikinci sayıyı geri döndüren method.!!
 */
public class ornek22 {
    public static  int ikiBuyuk(int a[]){
        int max =a[0], sayac =0,indis =0;
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max = a[i];
                indis=i;
                sayac =0;
            }if(max==a[i]) {
                if(sayac <2){
                indis = i;
                sayac ++;
            }}
        }return indis;
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,213,2,213,25,213};
        System.out.println(ikiBuyuk(a));
    }
}
