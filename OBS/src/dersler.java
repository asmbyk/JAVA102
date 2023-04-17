public class dersler {
    private String DersinAdi;
    private String[] ogrenciler = new String[100];
    private int os; // ögrenci sayısı

    public dersler(String dersinAdi) {
        this.DersinAdi = dersinAdi;
    }

    public void ekle(String ogrenciler) {
        this.ogrenciler[os] = ogrenciler;
        os++;

    }

    public String[] getOgrenciler() {
        return ogrenciler;
    }

    public int getOgrenciSayisi() {
        return os;
    }

    public String getDersinAdi() {
        return DersinAdi;
    }

    public String cikar() {

        return ogrenciler[--os];
    }
}
