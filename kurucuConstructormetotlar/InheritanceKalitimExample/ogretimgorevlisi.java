public class ogretimgorevlisi extends Akedemisyen {
    private String kapiNo;

    public ogretimgorevlisi(String adSoyad, String telNo, String eposta, String unvan, String bolum, String kapiNo) {
        super(adSoyad, telNo, eposta, unvan, bolum);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " ögretim görevlisi giris yaptı . ");
    }
}
