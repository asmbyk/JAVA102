import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String yazi = "\noutput string ögreniyorum.";

        try {
            File dosya = new File("outputtry.txt");

            FileOutputStream output = new FileOutputStream("outputtry.txt",true);
            // ture olarak  ayarlanırsa bu sonuna ekleyecek, true olunca üzerine yazıyor
           byte[]yaziBytre = yazi.getBytes(); // veriyi byte cevirip txt aktarımını sagladık . array attık
            // file output byte oldugundan dolayı byte byte getBytes() metodunu kulanarak yaziByte dizisinin içine atadık .
            output.write(yaziBytre); // dosya yazdık
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.print(" ");
        }

    }
}