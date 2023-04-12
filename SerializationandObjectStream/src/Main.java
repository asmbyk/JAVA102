import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Main {

    public static void main(String[] args) {
      car c1 = new car("mercedes", "e250");
        try {
            FileOutputStream  outputFile= new FileOutputStream("araba.txt");
            ObjectInputStream output =new ObjectInputStream(outputFile);
            output.readObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}