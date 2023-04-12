package java101ornek;
/*
    //Kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonk.
 */
public class ornek36 {
    public  static  int kacBasamak(int a ){
        if(a ==0){
            return 0;
        }else {
            return 1+kacBasamak(a/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(kacBasamak(352));
    }
}
