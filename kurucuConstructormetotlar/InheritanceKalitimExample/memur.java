public   abstract class memur extends Akedemisyen {
    private String departman;
    private String mesai;

    public memur(String adSoyad, String telNo, String eposta, String unvan, String bolum, String departman, String mesai) {
        super(adSoyad, telNo, eposta, unvan, bolum);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis() {
        System.out.println(getMesai() + " saatlari arasında   ; " + getAdSoyad() + "  kişisi calıstı.  ");
    } @Override
    public  void  giris (){
        System.out.println(this.getAdSoyad() + " memur giris yaptı . ");
    }
}
