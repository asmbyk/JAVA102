package java101ornek;
/*
    //Kendisine parametre olarak gelen sayı kadar adınızı ekrana yazan rekürsif metodu.
 */
public class ornek38 {
    public  static  String adsoy(int a){
        if(a==0){
            return "son";
        }else {
            return "ahmet asım bıyıklı"+adsoy(a-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(adsoy(5));
    }
}
