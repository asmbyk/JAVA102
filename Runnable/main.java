public class main {
    // runnable interface kullanarak tread oluşturabiliyoruz .
    public static void main(String[] args) {
        Counter c1 = new Counter("Counter 1 ");
        Counter c2 = new Counter("Counter 2 ");
        Counter c3  = new Counter("Counter 3 ");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}
