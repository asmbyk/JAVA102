import java.sql.SQLOutput;

class ogrenci {
    String ad;
    String soyad;
    char cinsiyet;
    int yas;

    public ogrenci(String ad, String soyad, char cinsiyter, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }
}

public class Main {
    public static void main(String[] args) {

        ogrenci o = new ogrenci("ali ", "calıskan ", 'E', 22);
        System.out.println(o.ad + " " + o.soyad + " " + o.cinsiyet + " " + o.yas);
        ogrenci[] ogrencis = new ogrenci[30];
        for (int i = 0; i < ogrencis.length; i++) {
            ogrencis[i] = new ogrenci("a","b",'e',22);
            System.out.println(ogrencis[i].ad + ogrencis[i].soyad );
        }

    }
}