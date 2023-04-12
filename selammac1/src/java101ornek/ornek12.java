package java101ornek;
/*
    //Kendisne parametre olarak gelen stingteki "aa" striglerinden kaç adet olduğunu geri döndüren metod.

 */
public class ornek12 {
    public  static  int bul ( String a) {
        int sayac =0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a' && a.charAt(i) == 'a'){
                sayac ++;
            }

        }return  sayac;
    }

    public static void main(String[] args) {
        System.out.println(bul("aaaahmet"));
    }
}
