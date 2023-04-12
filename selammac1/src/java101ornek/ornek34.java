package java101ornek;
/*
    //Kendisine parametre olarak gelen sayının faktöriyelini hesaplayan rekürsif fonk.
 */
public class ornek34 {
    public  static  int fak (int a ){
    if(a ==0){
        return  1;
    }else {
        return  a *fak(a-1);
    }
    }

    public static void main(String[] args) {
        int x =  fak(5);
        System.out.println(5);
    }
}
