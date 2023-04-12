package metotlars;
//Kendisine parametre olarak gelen pozitif tamsayıya kadar olan sayıların toplamını hesaplayan rekürisf metodu
public class ornek33 {
    public  static  int kendikadarolan( int n){
        if(n ==1) return 1;
        else return n +kendikadarolan(n-1);
    }

    public static void main(String[] args) {
        int x = kendikadarolan(5);
        System.out.println(x);
    }
}
