import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("cekilecek tuttarı belirleyiniz.");
        double price = k.nextDouble();
        System.out.println("Kart no belirleyiniz.");
        int cardNumber = k.nextInt();
        System.out.println("Son kulanım tarihi  yazınız.");
        double date = k.nextDouble();
        System.out.println("güvenlik kodu (cvc) giriniz.");
        double cvc = k.nextDouble();
        System.out.println("a baksaı için : 1");
        System.out.println("b bankası için : 2");
        System.out.println("c bankası için : 3");
        System.out.println("secmek istediginizbankayı tuşlayınız:  ");
        int selectBank = k.nextInt();
        switch (selectBank) {
            case 1:
                Abankasi aPos = new Abankasi("abankasi", "12312312312", "lksvhbrvl2324");
                aPos.connect("127.1.1.1231");
                aPos.payment(price,cardNumber, date,cvc);
                break;
            case 2:



            case 3:
            default:
                System.out.println("yanlış bir banka numarası sectiniz dah s onra tekrar deneyiz");

        }
    }
}
