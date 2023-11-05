public class Liste {
    // liste tanımı
    Ogrenci ilk, son = null;

    public void BasaEKLE(int no, String ad, String soyad, int vize, int genel) {
        Ogrenci ogr = new Ogrenci(no, ad, soyad, vize, genel);
        // başa ekleme
        if (son == null) {
            ilk = ogr;
            son = ogr;
        } else {
            ogr.sonraki = ilk;
            ilk = ogr;
        }

    }

    public void SonEKLE(int no, String ad, String soyad, int vize, int genel) {
        Ogrenci ogr = new Ogrenci(no, ad, soyad, vize, genel);
        if (ilk == null) {
            ilk = ogr;
            son = ogr;

        } else {
            son.sonraki = ogr;
            son = ogr;
        }
    }

    public void ArayaEKLE(int no, String ad, String soyad, int vize, int genel, int sira) {
        Ogrenci ogr = new Ogrenci(no, ad, soyad, vize, genel);
        int ogr_sayisi = ListedekiOGRsayisi();
        int j = 1;
        Ogrenci gecici = ilk;
        if (sira <= ogr_sayisi) {
            while (gecici != null) {
                if (j == sira) {
                    ogr.sonraki = gecici.sonraki;
                    gecici.sonraki = ogr;

                }
                gecici = gecici.sonraki;
                j++;
            }
        } else {
            System.out.println("Araya seyı ekleme yapılamıyor.");
        }
    }

    public void Listele() {
        Ogrenci gecici = ilk;
        while (gecici != null) {
            System.out.println("ögrenci no : " + gecici.no + " AD :" + gecici.ad + " Soyad: " + gecici.soyad + " Vize:  " + gecici.vize + " Genel:" + gecici.genel);
            gecici = gecici.sonraki;
        }
    }

    public void BastanSil() {
        ilk = ilk.sonraki;
        if (ilk == null) {
            son = null;
        }
    }

    public void SondanSil() {
        Ogrenci gecici, once;
        gecici = ilk;
        once = null;
        while (gecici != son) {
            once = gecici;
            gecici = gecici.sonraki;
        }
        if (once == null) {
            ilk = null;
            son = null;

        } else {
            once.sonraki = null;
            son = once;
        }
    }

    public void NumaradanSil(int no) {
        Ogrenci gecici, once;
        gecici = ilk;
        once = null;
        while (gecici.no != no) {
            once = gecici;
            gecici = gecici.sonraki;
        }
        once.sonraki = gecici.sonraki;
    }

    public void OgrenciBilgileri(int no) {
        Ogrenci gecici = ilk;
        while (gecici != null) {
            if (gecici.no == no) {
                System.out.println("ögrenci no : " + gecici.no + " AD :" + gecici.ad + " Soyad: " + gecici.soyad + " Vize:  " + gecici.vize + " Genel:" + gecici.genel);
                break;
            } else {
                gecici = gecici.sonraki;
            }
        }
    }

    public void TekveCift() {
        Liste Tek = new Liste();
        Liste Cift = new Liste();
        Ogrenci gecici = ilk;
        while (gecici != null) {
            if (gecici.no % 2 != 0) {
                Tek.SonEKLE(gecici.no, gecici.ad, gecici.soyad, gecici.vize, gecici.genel);

            } else {
                Cift.SonEKLE(gecici.no, gecici.ad, gecici.soyad, gecici.vize, gecici.genel);

            }
            gecici = gecici.sonraki;
        }
        System.out.println("Tek numara ögrenci listesi :");
        Tek.Listele();
        System.out.println("Cift numaralı ögrenvilerin numarası");
        Cift.Listele();
    }
    public void OrtalmaBul (){
        double ort=0 ;
        Ogrenci gecici =ilk ;
        while ( gecici != null){
            ort = gecici.vize*0.4 + gecici.genel*0.6;
            System.out.println(" Ögrenci no:  " + gecici.no + " Ortalama notu : " + ort);
            gecici = gecici.sonraki;
        }

    }
    public  void GenelenDusus(){
        int not = ilk.genel;
        Ogrenci  gecici = ilk;
        Ogrenci tmp = null;
        while(gecici != null){
            if(gecici.genel <not){
                not= gecici.genel;
                tmp = gecici;
            }
            gecici = gecici.sonraki;
        }
        System.out.println("en düşük genel sınav notuda sahip ögrenci");
        System.out.println("ögrenci no : " + tmp.no + " ad " + tmp.ad +" soyad" + tmp.soyad + " genel not : "  + tmp.genel);

    }

    public int ListedekiOGRsayisi() {
        int ogrenci_sayisi = 0;
        Ogrenci gecici = ilk;
        while (gecici != null) {
            gecici = gecici.sonraki;
            ogrenci_sayisi++;
        }
        return ogrenci_sayisi;
    }
}

class Ogrenci {
    //düğüm tanımı
    int no;
    String ad;
    String soyad;
    int vize;
    int genel;
    Ogrenci sonraki;

    Ogrenci(int no, String ad, String soyad
            , int vize, int genel) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.genel = genel;
        sonraki = null;
    }
}
