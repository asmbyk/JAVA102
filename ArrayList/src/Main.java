import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(); // tanımlama
        // veya ArrayList olabiloyur
        liste.add(10);
        liste.add(00011);
        liste.add(1);
        liste.add(1);
        liste.add(120);
        liste.add(2);
        liste.add(3);
        liste.add(null); // nullda mevcut
        System.out.println(liste); // java bizim için oanlık görmekk için bir ksıayol olusturuyor.
        Iterator<Integer> itr = liste.listIterator();
        while ((itr.hasNext())){
            System.out.println(itr.next());
        }
        for (Integer element: liste) { // forench kulanımı
            System.out.println(element);

        }
        System.out.println("------------");
        // belli maşlı kulanılan metotlar
        System.out.println(liste.size()); // liste boyutu
        System.out.println(liste.get(3)); // 4 geri döndürdü
        // get kulanıldıgı yerlerde try chach kulabiliriz.
        System.out.println(" ------------- ");
        System.out.println("");
        System.out.println(liste.indexOf(1));
        System.out.println(liste.indexOf(null));// bulma
        System.out.println(liste.lastIndexOf(1));
        // arraylerde araya eleman eklemek cok zor fakt
        liste.add(2,15); // 2 indexe 15 ekledık sondakileri öteledi
        //arraylerda cok uzun sürüyor
        liste.set(2,15);//2. 15 olarak degğiştirdi
        System.out.println(liste.contains(1313313)); // arama yaptık
        System.out.println(liste.remove(1)); //1.indexsi silip baştan index numarasını verdirdik
         //liste.addAll(liste2) lsiteleri birbirine ekledik liste.subList(2,5); 2den 5 kadar olani aldı. alt liste vb

    }
}