package metotlars;
//Kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonk.
public class ornek34 {
    public static  int kacBrefkif(int a){
        if(a ==0) return 0;
        else return 1+kacBrefkif(a/10);
    }

    public static void main(String[] args) {
        System.out.println(kacBrefkif(234234));
    }
}
