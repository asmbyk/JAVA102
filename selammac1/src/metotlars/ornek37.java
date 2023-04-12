package metotlars;
//Kendisine parametre olarak gelen n tamsayısına karşılık fibonacci sayısını hesaplayan rekürsif metodu.
public class ornek37 {
    public  static  int fiborek( int a ){
        if( a ==0) return  0 ;
        else if ( a ==1) return  1;
        else {
             return fiborek(a - 1) + fiborek(a-2);
        }
    }

    public static void main(String[] args) {
        int a = 7;
        System.out.println(fiborek(a));
    }
}
