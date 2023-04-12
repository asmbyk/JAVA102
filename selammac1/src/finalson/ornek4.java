package finalson;
//Kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu geri döndüren methodu yazınız.
public class ornek4 {
    public  static int kacbas(int a ){
        int sayac =0;
        while(a>0){
            a= a/10;
            sayac ++;
        }return  sayac;
    }

    public static void main(String[] args) {
        System.out.println(kacbas(1554));
    }
}
