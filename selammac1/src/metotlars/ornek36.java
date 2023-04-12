package metotlars;
//Kendisine parametre olarak gelen sayı kadar adınızı ekrana yazan rekürsif metodu.
public class ornek36 {
    public  static  String adyaz(int a){
        if(a ==0) return  "son";
        else return  "Ahmet " + adyaz(--a);
    }

    public static void main(String[] args) {
        System.out.println(adyaz(5));
    }
}
