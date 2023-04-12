package finalson;
//Kendisine parametre olarak gelen string dizisindeki en uzun stringin indisini geri döndüren metod.
public class ornek19 {
    public static  int indexstr(String a[]){
        int max = a[0].length(), index =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > max) {
                max = a[i].length();
                index =i;
        }}return index;
    }

    public static void main(String[] args) {
        String a[] = {"ahmet","vaaaaeli", "deli"};
        System.out.println(indexstr(a));
    }
}
