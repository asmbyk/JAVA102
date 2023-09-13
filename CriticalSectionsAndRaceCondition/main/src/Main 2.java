import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic = new OrderMatic();
        /* OrderMatic oMatic = new OrderMatic();
        Thread t1 = new Thread(oMatic);
        t1.start();
        t1.join(); // join ile bagımsız halde calısmasının saglıyoruz .
        Thread t2 = new Thread(oMatic);
        t2.start(); */

        List<Thread> islemler= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(oMatic);
            islemler.add(t);
            t.start(); // 2 tanesi 7 alabilir aynı thread kulanabilir

        }
        for (Thread t: islemler) {
            t.join(); // for ile cözüm denedik örnek oalrak 7 almamaları için başarılı olmadılar


        }
        System.out.println(oMatic.getOrderNo());
    }
}