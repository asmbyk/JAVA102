package cıkmıs;
// klavyeden girilen 2 stringin karakterli arasında yerleri aynı olmak
// sartıyla birbirilerinden farklı olan karakteri bitleştirip geri döndüren metot
public class ornek1 {
    public  static  String  bul(String a , String b){
        String str = "";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) str = str + a.charAt(i) + b.charAt(i);
        }return  str;
    }

    public static void main(String[] args) {
        String a = "ahmet";
        String b = "mehee";
        System.out.println(bul(a,b));
    }
}
