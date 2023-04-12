package metotlars;
 //Kendisine parametre olarak gelen stringin polindrome olup olmadığını geri döndüren metod.
public class ornek14 {
    public  static  String polBul(String a){
        String bos = "";
        for (int i = a.length()-1; i >=0 ; i--) {
            bos = bos + a.charAt(i);
        }if(bos.equals(a)) return "polimondur";
        else return "polimon degildir";
    }

     public static void main(String[] args) {
         String a = "adaw";
         System.out.println(polBul(a));
     }
}
