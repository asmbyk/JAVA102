package finalson;
//Kendisine parametre olarak gelen klavyeden girildiği tamsayı kadar adınızı ekrana yazan programı yazınız.

public class ornek3 {
    public  static   void ahmet( int a){
        for (int i = 0; i < a; i++) {
            System.out.println("ahmet");
        }
    }

    public static void main(String[] args) {
        ahmet(5);
    }
}
