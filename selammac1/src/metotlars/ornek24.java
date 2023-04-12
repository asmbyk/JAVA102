package metotlars;
//Kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki en büyük sayıyı index geri döndüren metod.

public class ornek24 {
    public  static String twoindex (int[][] a){
        int satir =0 , sutun =0 , max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]> max) {
                    max = a [i][j];
                    satir = i;
                    sutun = j;
                }
            }
        }return  satir + " " + sutun ;
    }

    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6}};
        System.out.println(twoindex(a));
    }
}
