package java101ornek;
/*
    //Kendisine parametre olarak gelen tamsayının asal olup olmadığını geri döndüren metod.
 */
public class ornek31 {
    public  static  String asalBul2(int a ){
        int sayac =0;
        for (int i = 2; i < a; i++) {
            if(a%i ==0){
                sayac ++;
            }
        }if ( sayac == 0){
            String  asal= " sayınız assal sayi";
            return  asal ;
        }else{
            String asalDegil = " sayınız asal degil ";
        return  asalDegil;
        }

    }

    public static void main(String[] args) {
        System.out.println(asalBul2(11));
    }
}
