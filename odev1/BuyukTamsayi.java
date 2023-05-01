import java.math.BigInteger; // büyük sayı degeri oldugu için bigınteger sınıfı  ekledim

public class BuyukTamsayi { // hocamın dedigi gibi Buyuktamsayi adında sınıf olusturdum.
        private int[] basamak; // bsamak tutmak için dizi
        private int uzunluk; //uzunluk tutmak için
    /*
    degişkenleri getter setter metodu gibi sonradan istedigimiz komutlara uygun olduklarında dolayı private olarak tanımladım.
     */

        public BuyukTamsayi(String number) {
            this.uzunluk = number.length(); //gelen sayıyı sting olarak uzunlugu  uzunluk degişkenine eşitledik birbire karısmaması için lazımcı lugatı geregi this kullandım
            this.basamak = new int[this.uzunluk]; //uzunluk dizinin boyuta atadım
            for (int i = 0; i < this.uzunluk; i++) {
                this.basamak[i] = number.charAt(i) - '0'; // diziye sting oldugundan dolayı karakter karakter attım charAt ile
            }
        }

        public String toString() { // sayıyı string cevirme toString metodu ile
            StringBuilder sb = new StringBuilder();
            for (int basamak1 : this.basamak) {
                sb.append(basamak1); //append ile ekleme
            }
            return sb.toString();
        }

        public BuyukTamsayi toplama(BuyukTamsayi other) { // topala işlemi
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(other.toString());
            BigInteger resultNumber = thisNumber.add(otherNumber);
            return new BuyukTamsayi(resultNumber.toString());
        }

        public BuyukTamsayi cikarma(BuyukTamsayi other) { // cıkartma işlemi
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(other.toString());
            BigInteger resultNumber = thisNumber.subtract(otherNumber);
            return new BuyukTamsayi(resultNumber.toString());
        }

        public boolean esitMi(BuyukTamsayi other) { //eşitmi sorgusu
            return this.toString().equals(other.toString());
        }

        public boolean esitDegilMi(BuyukTamsayi other) { // eşit degilmi sorgusu
            return !this.esitMi(other);
        }

        public boolean buyukMu(BuyukTamsayi other) { // büyükmü sorgusu
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(other.toString());
            return thisNumber.compareTo(otherNumber) > 0;
        }

        public boolean kucukMu(BuyukTamsayi digersay) { //
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(digersay.toString());
            return thisNumber.compareTo(otherNumber) < 0;
        }

        public boolean buyukEsitMi(BuyukTamsayi digersay) {
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(digersay.toString());
            return thisNumber.compareTo(otherNumber) >= 0;
        }

        public boolean kucukEsitMi(BuyukTamsayi digersay) {
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(digersay.toString());
            return thisNumber.compareTo(otherNumber) <= 0;
        }

        public BuyukTamsayi carpma(BuyukTamsayi other) {
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(other.toString());
            BigInteger resultNumber = thisNumber.multiply(otherNumber);
            return new BuyukTamsayi(resultNumber.toString());
        }

        public BuyukTamsayi bolme(BuyukTamsayi digersay) {
            BigInteger thisNumber = new BigInteger(this.toString());
            BigInteger otherNumber = new BigInteger(digersay.toString());
            BigInteger resultNumber = thisNumber.divide(otherNumber);
            return new BuyukTamsayi(resultNumber.toString());
        }
    }

}

