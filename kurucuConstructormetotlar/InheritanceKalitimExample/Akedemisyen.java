public abstract class Akedemisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akedemisyen(String adSoyad, String telNo, String eposta, String unvan, String bolum) {
        super(adSoyad, telNo, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void  abstract derseGir(String derseGir) ;

    @Override // calısan sınıfından bir metodu overloding ettik .
    public void giris() {
        System.out.println(this.getAdSoyad() + " akademisyen  a kapoısında derse giris yaptı . ");
    }
}
