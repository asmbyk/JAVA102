public class   Abankasi implements Ibank {
    private String bankName;
    private String terminal_id;
    private String password;

    public Abankasi(String bankName, String terminal_id, String password) {
        this.bankName = bankName;
        this.password = password;
        this.terminal_id = terminal_id;

    }

    public boolean connect(String ipAdress) {
        System.out.println("kulanıcı ip" + ipAdress);
        System.out.println(" makina ipsi " + this.hostIPAdress);
        System.out.println(this.getBankName() + "  bankasının agına baglanıldı . ");
        return true;
    }

    public boolean payment(double price, int cardNumber, double expiryDate, double cvc) {
        // banka ödeme işlemleri yapıldı
        System.out.println("bankadan cevap bekleniyor");
        System.out.println("işlem başarılı oldu ! ");
        return true;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
