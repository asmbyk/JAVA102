package java101ornek;
/*
    //Kendisine parametre olarak gelen n tamsayısına karşılık fibonacci sayısını hesaplayan rekürsif metodu.
 */
public class ornek39 {
    public static  int fiboBulRe(int a ){
        if(a==0){
            return 0;
        } else if (a==1) {
            return 1;

        } else {
            return fiboBulRe(a-1)+fiboBulRe(a-2);
        }
    }

    public static void main(String[] args) {
        int a =3;
        System.out.println(fiboBulRe(a));
    }

}
