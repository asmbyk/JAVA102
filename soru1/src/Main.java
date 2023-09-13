import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class ThreadOrnek implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Merhaba Dünya");
            try {
                Thread.sleep(500); // 0.5 saniye bekletme
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadOrnek nesne = new ThreadOrnek();
        Thread thread = new Thread(nesne);
        thread.start();
    }
}

public class Main {
    private String ad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}