public class main {

    public static void main(String[] args) {
        Calisan c1 = new Calisan("mehmet ", "503423423", "ahmetasm61@gmail.com");
        //Akedemisyen a1 = new Akedemisyen("yusuf", "123123123", "ahemrceace@gmail.com", "Dr.", "bilgisayar mühendisi");
        // memur m1 = new memur("memur", "123123123", "ahmescmece@gsdfdsdf.com", "memur", "idari işler ", "doktora ", "aksam 9 sabah 5 ");
        ogretimgorevlisi og1 = new ogretimgorevlisi("mehmet ", "123123", "asdfasf@gmail.com", "dr", "pc", "123123");

        // Calisan m1 =  new memur("memur","123123123","ahmescmece@gsdfdsdf.com","memur","idari işler ","doktora ", "aksam 9 sabah 5 ");
        // calısan sınıfında bir memur olusturuyor ama
        // m1.getmesai olmuyor.

        /*
        og1.getKapiNo();
        c1.getAdSoyad();
        m1.getMesai();
        c1.giris();
        a1.cikis();
        a1.giris(); // overloading işemelemi yaptık .
        a1.getAdSoyad();
        a1.getBolum();
        a1.getUnvan();
        a1.derseGir();
        og1.getAdSoyad();
        og1.giris(); // ilk once reveras oldugu sınıfa bakıyor .
         m1.getMesai();
        */
       /*
        // Polymorphism (Çok Biçimlilik) İlkesi :  nesneye yöelik programlarada kesin buluyor
        c1.giris();
        a1.cikis();
        m1.giris();
        og1.giris();
        Calisan a3 = new Akedemisyen("selam ", "2312514211", "ahmwtasdmwvr@gmailc.nom", "dr", "pc");
        a3.giris(); // giris over ride edildigi için cagırabildik
        // a3.getUnvan(); fakt unvan parametresi  override edilmedigi için cagıramadık .
        a3.cikis(); // veya  calısan yani super class bulunan seylere erişebiliriz.
         //int [] loginUser = new int[5];
        Calisan[] loginUser = {a1};
        Calisan.girisYapanlar(loginUser); */
        // işi yapan kişi ögretim göevlisi ve asistan b ü yüzden calısan sınıfında nesne üretmek için bir fayda sagalyaamıyacak
        // Abstraction (Soyutlama) İlkesi classların için bos olacak sadece adı ve alacagı parametreler olacak.
        //


    }
}
