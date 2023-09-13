public class Calisan {
    private String adSoyad;
    private String telNo;
    private String eposta;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public Calisan(String adSoyad, String telNo, String eposta) {
        this.adSoyad = adSoyad;
        this.telNo = telNo;
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + "  ; ; üniversiteye giris yaptı .");
    }

    public void giris(String girissaati) {
        System.out.println(getAdSoyad() + " giris ypatı " + girissaati);
    }

    public void cikis() {
        System.out.println(this.adSoyad + " ; ; üniversiteden cıkıs yaptı ");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " ; ; yemekhaneye hakkını kullandı ");
    } public  static  void girisYapanlar ( Calisan [] loginUSERS){
        for (Calisan  c: loginUSERS) {
            c.giris();
            

    }
}
