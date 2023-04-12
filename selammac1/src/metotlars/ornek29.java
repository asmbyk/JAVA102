package metotlars;
//Kendisine parametre olarak gelen tamsayının asal olup olmadığını geri döndüren metod.
public class ornek29 {
    public static void main(String[] args) {
        System.out.println(asalBul2(7));
    }

    public static String asalBul2(int a) {
        int sayac =0;
       if(a<2)  return "asal degil";
        for (int i = 2; i <a/2 ; i++) {
            if(a%i ==0) sayac ++;
        }if(sayac ==0) return " sayı asaldır";
        return " asal degildir";
    }
}
