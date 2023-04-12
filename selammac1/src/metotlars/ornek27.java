package metotlars;
//Kendisine parametre olarak gelen 3*3 lük A ve B matrislerinin toplamını geri döndüren method.
public class ornek27 {
    public  static  int matrixTop ( int [][]a , int [][]b ){
        int top1 = 0 , top2 =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                top1 =+ a[i][j];
                top2 =+ b[i][j];
            }
        }return  top1+top2;
    }

    public static void main(String[] args) {
        int a[][]={{4,5,8},{5,9,6},{3,8,1}};
        int b[][]={{4,5,8},{5,9,6},{3,8,1}};
        System.out.println(matrixTop(a,b));
    }
}
