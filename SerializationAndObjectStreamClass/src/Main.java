import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        //Serileştirme : serialization  java nesne yönelimli bir programlama dili:
        //serialzation api seklinde java dısında depolama saglayabliliyoruz. nesleştirdik
        Car c1 = new Car("auide", "A3");
        try {
            FileOutputStream outputfile = new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputfile);
            output.writeObject(c1);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      // input aynı sekilde kulanılıyor. file olusturum object içine attık
         //Car  nextCar = ( Car) inputStream.readObject(); car yazdırdık.
    }
}