import  java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "java102 ögreniyorum";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] bytearray = data.getBytes(); // stringi byte cevirdik.
        try {
            output.write(bytearray);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//string komple byte cevirdik bir dizide
}