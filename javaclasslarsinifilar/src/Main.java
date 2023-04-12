public class Main {
    public static void main(String[] args) { // bir arabanın gaza basması gibi durumlar ısınıfları
        car audio = new car(); // kurucu metot
        audio.models = "Aido a7";
        audio.type = "sedan ";
        audio.color = "red ";
        audio.speed = 10 ;
        audio.speedLimit = 250 ;
        audio.increseSpeed(10);
        audio.decreaseSpeed(5);
        audio.printSpeed();


        car bmw  = new car ();
        bmw.models = " m3";
        bmw.color = " blue";
        bmw.type = "sports";
        bmw.speed = 20;
        bmw.speedLimit = 200;


        car mercedec = new car();
        mercedec.type  = " eco ";
        mercedec.speed = 15;
        mercedec.models = "e250";
        mercedec.color = "black";
        mercedec.speedLimit = 500;




    }
}