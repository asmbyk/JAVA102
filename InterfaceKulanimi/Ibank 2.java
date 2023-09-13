public interface Ibank {
     /*
     banka postların kulanıcalagı metotları yazabiliriz. degişken tanımlamıyor
     metotdun içerigi yazılmıyor üst sablon gibi düşünebiliriz

      */
    final  String hostIPAdress= "127.0.0.1231";
   boolean connect(String ipAdress);
   boolean payment(double price , int cardNumber, double expiryDate, double cvc);

}
