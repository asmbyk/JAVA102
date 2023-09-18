import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
  // priority istdigimiz bir sırayla sıralamamızı saglar
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);

            }
        });
        q.add("mustafa");
        q.add("ahmet");
        q.add("mehmet");
        q.add("yusuffff");
        for (String s : q) {
            System.out.println(s);

        }
    }
}