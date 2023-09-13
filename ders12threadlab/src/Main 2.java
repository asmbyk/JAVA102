import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class isparcacigi extends Thread {
    private String cumle;
    private String satirNo;

    public isparcacigi(String cumle, String isim, String satirNo) {
        super(isim);
        this.cumle = cumle;
        this.satirNo = satirNo;

    }

    @Override
    public void run() {
        String[] kelimeler = cumle.split(","); // vürgülden böldük.
        System.out.println(this.getName() + " , okunan satir " + satirNo + " , kelime sayısı  " + kelimeler.length);


    }

    public String getCumle() {
        return cumle;
    }

    public void setCumle(String cumle) {
        this.cumle = cumle;
    }

    public String getSatirNo() {
        return satirNo;
    }

    public void setSatirNo(String satirNo) {
        this.satirNo = satirNo;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            File dosya = new File("örnek.txt"); // dosya olusturduk
            Scanner oku = new Scanner(dosya); //scanner sınıfına tamımladık
            while (oku.hasNext()) {  // okuması için sonsuz döngü
                if (!dosya.exists()) {
                    dosya.createNewFile();
                }
                String satir = oku.nextLine();
                int s1 = satir.indexOf("Thread1"); // thread1 varmı diye baktık
                int s2 = satir.indexOf("Thread2");  // thread2 varmı diye baktık
                int s_say = 0;
                if (s1 >= 0) {
                    //Thread1 yazısı okudu ve 1den büyük veya eşit oldugu için Thread 1 calıstırdık !
                    isparcacigi t1 = new isparcacigi(satir, "Thread1", s_say);
                    t1.start();
                } else if (s2 >= 0) {
                    //thread2 calısacak else demedim cünkü thread yazısı olmama ihtimalini düşündüm

                    isparcacigi t2 = new isparcacigi(satir, "Thread2", s_say);
                    t2.start();
                }
                s_say ++;

            }
        } catch (Exception e) {
            System.out.println("Dosya bulunamadı hatası ! ");
        }

    }
}