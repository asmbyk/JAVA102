package metotlars;
//Kendisine parametre olarak gelen a ve b sayısının a^b sini hesaplayan rekürsif fonksiyonu
public class ornek35 {
    public  static  int austbrekorsift ( int a , int b){
        if(b ==0){
            return 1;
        }else return a*austbrekorsift(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(austbrekorsift(2,3));
    }
}
