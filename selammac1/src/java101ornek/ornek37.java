package java101ornek;
/*
    //Kendisine parametre olarak gelen a ve b sayısının a^b sini hesaplayan rekürsif fonksiyonu
 */
public class ornek37 {
    public static int reust ( int a , int b){
        if(b==0){
            return   1;
        }else {
            return a*reust(a,b-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(reust(3,3));
    }

}
