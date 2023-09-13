public class main {
    public static void main(String[] args) {
   Thread t1 = new Thread( new Counter("c1", 1) );
   t1.start();
    }
}
