public class Main {
    public static void main(String[] args) {
        /*


        // undefined tanımlama aslında tanımlanmadı
        String s ;
        String s1 = null ; // null demek deger kutucugu var fakat içi boş denek
        // empty  içi boş
        String s2 = "";
        */
         /*String str = "312313";
        Nullable n = new Nullable(str);
        n.run();
        Integer a1 = 0;
        NullableInt a = new NullableInt(a1);
        a.run();


        geneticNullable<Integer> n = new geneticNullable<Integer>(10);
        n.run();

          */
        int  a= 10;
        String b = "asım";
        double d =1.12321;

        test<Integer, String,Double> t = new test<>(a,b,d);
        t.showInfo();
    }

}