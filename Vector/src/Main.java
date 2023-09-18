import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("istanbul");
        vector.add("Ankara");
        vector.add("izmir");
        vector.add( 2,"bolu");
        System.out.println(vector.contains("Ankara"));
        Iterator<String> itr = vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String str: vector) {
            System.out.println(str);
        }



    }
}