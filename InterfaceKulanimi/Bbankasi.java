public class Bbankasi {
    private String bankName;
    private String terminal_id;
    private String password;

    public Bbankasi(String bankName, String terminal_id, String password) {
        this.bankName = bankName;
        this.terminal_id = terminal_id;
        this.password = password;
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
