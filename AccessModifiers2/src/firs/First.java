package firs;

public class First {
    private String str = " ";

    First(String str) {
        this.str = str;
    }

    private void showStr() {
        System.out.println(this.str); // private verdigim için first clasında erişmekte bir sorun yasamadım
        // . a.showStr hata alıyoruz.
    }

    void show(){
        this.showStr();
    }
}
