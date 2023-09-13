public class main {
    public static void main(String[] args) {
        Counter c1 = new Counter("1 thread");
        Counter c2 = new Counter( "2 thread ");
        c1.start();
        c2.start();


    }
}

