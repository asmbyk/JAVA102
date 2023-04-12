import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("1.sporcunun adını giriniz.");
        String namef1 = k.next();
        System.out.println("1. Sporcunun kilosununu giriniz;");
        int weighf1 = k.nextInt();
        System.out.println("2.Sporcunun adını giriniz;");
        String namef2 = k.next();
        System.out.println("2.sporcunun kilosunu giriniz");
        int weighf2 = k.nextInt();



        Fighter  f1 = new Fighter(namef1, 0,100, weighf1);
        Fighter  f2 = new Fighter(namef2, 0,100 ,weighf2);
        Match match = new Match(f1 ,f2 ,90,100);
        match.run();



    }
}