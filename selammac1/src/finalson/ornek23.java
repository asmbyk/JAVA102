package finalson;
//Kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki en büyük sayıyı geri döndüren metod.
public class ornek23 {
    public static  int bo2(int a [][]){
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(max<a[i][j]) max = a[i][j];
            }
        }return max;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,6,5}};
        System.out.println(bo2(a));
    }
}
