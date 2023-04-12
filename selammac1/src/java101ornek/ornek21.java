package java101ornek;
/*
    //Kendisine parametre olarak gelen string dizisindeki en uzun stringin indisini geri döndüren metod.
 */
public class ornek21 {
    public  static  int dizi ( String a []){
        int uzun, index =0 ;

        uzun = a[0].length() ;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()>uzun){
                uzun = a[i].length();
                index =i;
            }
        }return index;
    }

    public static void main(String[] args) {
        String a [] = {"ahmet", "veli","delii", "dvsvsvsvsvsfss"};
        System.out.println(dizi(a));
    }
}
