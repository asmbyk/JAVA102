import java.util.HashSet; // hash seti java util dehil etti
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    // interface yapılı olsutrurur içi doldurmak bizd
        // Set ınterface ve hashset : setler uniq lerdir aynı veriler 2 kere tutulamazlar ahmet-ahmet olmaz
        // bir hashleme yöntemi vardır ( sifreleme yöntemi denilebilir)
        //a ==> 12312312334;
        // b ==> 123123243242;
        // bu tarz sayıları  karmasık bir fonsiyondan üretirlir
        // hafızadaki tutumuda hashlerle yaptıgı için indix numarası dısında oldugu için aynı degelr,i  eklemesini engellelr.
        // hashlerde null degeride atılabiliyor.
        HashSet<Integer> hSet = new HashSet<>();
        // bir boyut vermeik verdikce genişleyecek bir yapısı vardır.
        hSet.add(10);
        hSet.add(20);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);
        System.out.println(hSet.size());
        System.out.println(hSet.isEmpty()); // deger varmı
        System.out.println();
        System.out.println(hSet.contains(20)); // 20 sayısı varmı diye sorduk
        System.out.println();
        hSet.remove(10);//10 sildik
         // hSet.clear();// hepsini sildik

        for (Integer sayi : hSet) {
            System.out.println(sayi); // 20 -10 -30 oldu üstüste yazdıgı için sıra gitti giren cıkan sayısı farklı hash göre degişiyor

        }
        System.out.println("------------------------------");
        Iterator<Integer> itr  = hSet.iterator(); // bizim ürettigimiz hset alıp kulailirsin diyoruz.
        // iterator arama yapmamızı saglıyor gezmemizi saglıyor.
        // bir sornaki elamanı varmı diye bakıyor . hasNext //. sonraki için hasNext
        while(itr.hasNext()){
            System.out.println(itr.hasNext()); //
        }


    }
}