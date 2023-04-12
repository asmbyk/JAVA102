package metotlars;
//Kendisine parametre olarak gelen sayının faktöriyelini hesaplayan rekürsif fonk.
public class ornek32 {
public static  int fakRek ( int n){
    if( n==0){
        return  1;
    }else  return  n*fakRek(n-1);
}

    public static void main(String[] args) {
        int x = fakRek(5);
        System.out.println(x);
    }
}

