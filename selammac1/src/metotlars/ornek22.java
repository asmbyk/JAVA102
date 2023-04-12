package metotlars;
//Vize ve final notlarının bulunduğu iki diziyi parametre olarak alıp öğrencilerin ortalamasını hesaplayıp
public class ornek22 {
    public  static double ortalamBul ( int a[] , int b []){
        double toplamV =0 , toplamF =0, ortalama =0;
        for (int i = 0; i < a.length; i++) {
            toplamV = a[i] +toplamV;
            toplamF = b [i] + toplamF;
        } ortalama = toplamF*0.60 + toplamV*0.40;
    return ortalama;
    }

    public static void main(String[] args) {
        int a[] = {35};
        int b [] = {60};
        System.out.println(ortalamBul(a,b));
    }
}
