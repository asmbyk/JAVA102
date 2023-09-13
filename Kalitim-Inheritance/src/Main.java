public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("ahmet ", "506045454 ", "afmsgsdgm@gmail.com");
        Akedemisyen a1 = new Akedemisyen("mehmet kücük ", "50234203423", "aaed33d3dq@mdcnsv.com", "bilgisayar", "dr;");
        Akedemisyen a2 = new Akedemisyen("mehmet hoca ", "24124124", "ahmetasm61@gmail.com", "yazılm meh.", "dr");
        Memur m1 = new Memur("memur emhemt", "31231313123", "ahmetcewcw@gmail.com", "doktor", "aksam 5 sabah 5");
        Memur m2 = new Memur("asım", "53768278635", "ahmetasm123@gmail.com", "ogrt", "9pm-22pm");
      /*
      claısan sınıfından memu üretebiliriz ama memur sınıfında calısan üretemeyiz.
       */
        a1.cikis();
        a1.DerseGir();
        m1.Calis();
        m2.Calis();
        m2.getMesai();
        a2.DerseGir();
        a2.getBolum();
        a1.cikis();
        a2.getBolum();
        // metotlarda overlooding; asırı yüklenme
        //c1.giris("16.00");
        a1.giris();// üniversiteye giris ypatı yerine over ride akedemisyen olarka giris yaptı yazdı .
        int [] loginUser = new int[3];
         Calisan[] = loginUser {a1,a2,c1,m1};
    }
}