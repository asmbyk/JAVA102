import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //linked bağlı liste
        LinkedList<String> list = new LinkedList<>();
        list.add("ahmet");
        list.add("mehmet");
        list.add("yusuf");
        list.add("102");
        list.remove("mahmet"); // index numarasına verebişlirz
        Iterator<String> itr = list.iterator();
        while
        (itr.hasNext()) {
            System.out.println(itr.next());
        } // forech gezmek mümkün
        // arka planda calısam ve malieti olarak fark var
        //linked listeler eleman ekleyip cıkarmanın cok oldugu yerlerde daha mantıklı yapılar
        // normal listede hep bütün sayıları sağa kaydırmak gerekiyor.
        // bu noktada liste yapılar cok daha mantıklı
        

    }
}