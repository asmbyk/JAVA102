import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        try {
            File dosya= new File("patika.txt");

            FileInputStream input = new FileInputStream("patika.txt"); // byte byte okumayı saglıyor.,
            int i = input.read();
            while ( i != -1){
                System.out.print((char)i);
                i= input.read();
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}