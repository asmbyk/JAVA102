class isparcacigi extends Thread {
    public void run() {
        System.out.println("Merhabalar dünya !!");
    }
}
class isparcacigi2 implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("merhaba dünya " + i );

        }
    }
}
public class Main {
    public static void main(String[] args) {
        isparcacigi ip = new isparcacigi();
        isparcacigi2 ip2 = new isparcacigi2();
        // ip2.run(); run diyebilirz veya thread nesne olusturmamız lazım
        Thread t1 = new Thread(ip2);
        t1.start();
        ip.start();
    }

}




