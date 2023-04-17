public class Main {
    public static void main(String[] args) {
        dersler ders1 = new dersler("algoritma ve programlama");
        dersler ders2 = new dersler("ayrık matematik ");
        ders1.ekle("ayse emir ");
        ders1.ekle("mehmet");
        ders2.ekle("asım");
        ders2.ekle("selamlar");

        System.out.println(ders1.getDersinAdi() + " dersine kayıtlı ögrenci sayısı " + ders1.getOgrenciSayisi());
        System.out.println(ders2.getDersinAdi() + " dersine kayıtlı ögrenci sayısı " + ders1.getOgrenciSayisi());
        String[] ogrenciler = ders1.getOgrenciler();
        System.out.println(ders1.cikar());
        for (int i = 0; i < ders1.getOgrenciSayisi(); i++) {
            System.out.println(ogrenciler[i] + " , " );

        }


    }
}