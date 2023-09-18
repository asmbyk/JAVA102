import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
    // cift yapılı liste polimorfizim sözz konusu Queue : kuyruk demek first in first out
        // linkedlist ver, yapıların baglıgının konularıdır.
        //FIFO yapısı last input first out seklindede kulanablilir
        // polimorfizim cok bicimlilik
        Queue<String> q = new LinkedList<>();
        q.add("Mustafa");
        q.add("çetinkaya");
        // bir elanamı bulmak istiyorsak bütün kuyrugu gezmek lazım get yok
        q.offer("patika");
        q.remove(); // deger vermezsek başındaki elemanı siliyor.
        System.out.println(q.poll()); // elamanı önceden verirr
        System.out.println(q.peek()); //
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}