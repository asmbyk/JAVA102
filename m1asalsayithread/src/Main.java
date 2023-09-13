// 1 milyon tane asal sayıdan bulanildigi kadarını bulup yazan thread

class Asalsayi extends Thread {
    public static final int maxAsal = 1000000;
    public static final int onSaniye = 10000;
    public boolean bittimi = false;

    @Override
    public void run() {

        int[] asallar = new int[maxAsal];
        int sayi = 0;

        for (int i = 2; i < maxAsal; i++) {

            if (bittimi) {
                return;
            }
            boolean asal = true;

            for (int j = 0; j < sayi; j++) {
                if (i % asallar[j] == 0) {
                    asal = false;
                    break;
                }

            }
            if (asal) {
                asallar[sayi++] = i;
                System.out.println("bulunan sayi ::" + i);
            }

        }


    }
}


public class Main {


    public static void main(String[] args) {

        Asalsayi asayi = new Asalsayi();
        asayi.start();

        try {
            Thread.sleep(asayi.onSaniye );
        } catch (Exception e) {
            System.out.println("hata meydana geldi ");


        } asayi.bittimi = true ;
    }
}
