package finalson;
//Kendisine parametre olarak gelen tamsayı dizisindeki en küçük teriminin indsini geri döndüren metod.
public class ornek16 {
    public  static  int index(int []a){
        int index =0 , max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){ max = a [i];
                    index =i; }

        }return  index;
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        System.out.println(index(a));
    }
}
