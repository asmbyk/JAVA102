package finalson;
//Kendisine parametre olarak gelen tamsayı dizisinin sıralı olup olmadığını geri döndüren metod.
public class ornek17 {
    public static boolean sirali23(int a []){
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[i-1] )return false;
        }return true;
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        System.out.println(sirali23(a));
    }
}
