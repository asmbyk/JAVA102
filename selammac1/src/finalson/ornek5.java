package finalson;
//n. fibonacci sayısını geri döndüren method yazınız.
public class ornek5 {
    public  static  int  fibiBul( int n){
        if(n<=1)return n;
        int a =0 , b = 1 , c =0;
        for (int i = 2; i <=n ; i++) {
            c=a +b;
            a=b;
            b=c;

        }return c;
    }

    public static void main(String[] args) {
        System.out.println(fibiBul(7));
    }
}
