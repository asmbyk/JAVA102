public class Akedemisyen  extends Calisan {
    /*
    akedemisyen sınıfı subsınıf oldugudan dolayı  super sınıfta cekmemiz gereken seyleri extend calıskan
    ile cagırık eklemek için super super(); metodunu kulandık ;
     */
    private String bolum;
    private String unvan;

    public Akedemisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon ,eposta);
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

    }public  void  setUnvan(String unvan){
        this.unvan = unvan;
    }public  void DerseGir(){
        System.out.println(this.getAdSoyad() + "derse giris ypatı ;");
    }
    @Override // programcıya override edildigini gösterirriz.
    public  void giris(){
        System.out.println(this.getAdSoyad() + " akedemisyeni a kapısından giris yaptı ");

    }
}
