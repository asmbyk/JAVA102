package metotlars;
//Kendisine parametre olarak gelen 10 elemanlı tamsayı dizisindeki tek olanların ortalamasını geri döndüren metod.
public class ornek30 {
    public static  double ortalamTek(int a []){
        double ortalama , sayac =0, toplam =0;

        for (int i = 0; i < 10; i++) {
            if(a[i]%2==1);
            toplam =+ a[i];
            sayac ++;
        }ortalama = toplam/sayac;
        return ortalama;
    }

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5,6,7,8,9,19};
        System.out.println(ortalamTek(a));
    }
}
