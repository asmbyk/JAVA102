public class soru3 {
    private int tamsayi;

    public soru3(int tamsayi) { // ana kurucu
        this.tamsayi = tamsayi;
    }

    public soru3() { // varsayılan 5 atadık
        tamsayi = 5;
    }

    public int getTamsayi() {
        return tamsayi;
    }

    public void setTamsayi(int tamsayi) {
        this.tamsayi = tamsayi;
    }

    public int topla() {
        int toplam = 0; // Toplamı sıfırla
        for (int i = 0; i <= tamsayi; i++) {
            toplam += Math.pow(2, i); // 2'nin i'nci kuvvetini toplama ekle
        }
        return toplam; // Toplamı geri döndür
    }

     public String goster() {
        String seri = ""; // Seriyi boş bir metin olarak başlat
        for (int i = 0; i <= tamsayi; i++) {
            seri += "2^" + i; // Seriye 2'nin i'nci kuvvetini ekle
            if (i < tamsayi) {
                seri += "+"; // Son terim değilse artı işareti ekle
            }
        }
        return seri; // Seriyi geri döndür
    }
}
