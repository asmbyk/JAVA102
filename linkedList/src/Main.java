import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secim;
        Scanner klavye = new Scanner(System.in);
        Liste ogrenciler = new Liste();
        do {
            System.out.println("1- Öğrenciyi başa ekle  ");
            System.out.println("2- Ögrenciyi sona ekle ");
            System.out.println("3- Ögrenciyi araya ekle ");
            System.out.println("4- ögrenciyileri liste ");
            System.out.println("5- baştaki  ögrenci sil");
            System.out.println("6- sondaki ögrenciyi sil ");
            System.out.println(" 7- Numarası girilen ögrenciyi sil ");
            System.out.println("8- numarası girilen ögrencinin bilgileri ");
            System.out.println("9- listeki ögrencilerin sayısı getir.");
            System.out.println("10-  tek ve cift numaralı ögrencileri liste");
            System.out.println("11- ögrencilerin sınav ortalama listele");
            System.out.println("12- genel sıanv notu en düşük");
            System.out.println("0- cıkış!!");
            secim = klavye.nextInt();

            switch (secim) {
                case 1:
                    System.out.println(" Ögrencinin numarası giriniz..");
                    int bno = klavye.nextInt();
                    System.out.println("Ögrenci ad ");
                    String bad = klavye.next();
                    System.out.println(" ögrenci soyad");
                    String bsoyad = klavye.next();
                    System.out.println(" ögrenci vizeno  notu");
                    int bvize = klavye.nextInt();
                    System.out.println("ogrenci gelen notu");
                    int bgenel = klavye.nextInt();
                    ogrenciler.BasaEKLE(bno, bad, bsoyad, bvize, bgenel);
                    break;
                case 2:
                    System.out.println(" Ögrencinin numarası giriniz..");
                    int sno = klavye.nextInt();
                    System.out.println("Ögrenci ad ");
                    String sad = klavye.next();
                    System.out.println(" ögrenci soyad");
                    String ssoyad = klavye.next();
                    System.out.println(" ögrenci vizeno  notu");
                    int svize = klavye.nextInt();
                    System.out.println("ogrenci gelen notu");
                    int sgenel = klavye.nextInt();
                    ogrenciler.SonEKLE(sno, sad, ssoyad, svize, sgenel);
                    break;
                case 3:
                    System.out.println(" Ögrencinin numarası giriniz..");
                    int ano = klavye.nextInt();
                    System.out.println("Ögrenci ad ");
                    String aad = klavye.next();
                    System.out.println(" ögrenci soyad");
                    String asoyad = klavye.next();
                    System.out.println(" ögrenci vizeno  notu");
                    int avize = klavye.nextInt();
                    System.out.println("ogrenci gelen notu");
                    int agenel = klavye.nextInt();
                    System.out.println("ogrenciyi eklemek istediginiz sıra degeri ");
                    int asira = klavye.nextInt();
                    ogrenciler.ArayaEKLE(ano, aad, asoyad, avize, agenel, asira);
                    break;
                case 4:
                    ogrenciler.Listele();
                    break;
                case 5:
                    ogrenciler.BastanSil();
                    break;
                case 6:
                    ogrenciler.SondanSil();
                    break;
                case 7:
                    System.out.println("silmek istediginiz ögrencinin numarası");
                    int sil_no = klavye.nextInt();
                    ogrenciler.NumaradanSil(sil_no);
                    break;
                case 8:
                    System.out.println("bilgisi ögrenmek istediginiz ögrencisinin numarsı");
                    int ogr_no = klavye.nextInt();
                    ogrenciler.OgrenciBilgileri(ogr_no);
                    break;
                case 9:
                    int sayi = ogrenciler.ListedekiOGRsayisi();
                    System.out.println("listedeki ogrenci sayisi " + sayi);
                    break;
                case 10:
                    ogrenciler.TekveCift();
                    break;
                case 11:
                    ogrenciler.OrtalmaBul();
                    break;
                case 12:
                    ogrenciler.GenelenDusus();
                    break;


            }


        }while ((secim !=0));

    }
}