package metotlars;
//Kendisne parametre olarak gelen stingteki "aa" striglerinden kaç adet olduğunu geri döndüren metod.
public class ornek10 {
    public  static  int cevir ( String a ){
        int sayac =0;
        for (int i = 0; i < a.length(); i++) {
if(a.charAt(i) == 'a' && a.charAt(i+1) == 'a') {
    sayac ++ ;i = i+2;
        }}
        return  sayac;
    }

    public static void main(String[] args) {
        String a = "mehmet aaahmet";
        System.out.println(cevir(a));
    }
}
