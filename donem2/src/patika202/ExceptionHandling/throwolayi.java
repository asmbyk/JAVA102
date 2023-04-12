package patika202.ExceptionHandling;

import java.util.Scanner;

public class throwolayi
{
    public  static void chechAge (int age) throws Exception { // bir metot içerisinde kulanmak istiyorsak thows
        if(age<18){
            throw new Exception(" yaşınız tutmuyor ");


        }
        System.out.println("yaşı uygundur.");
    }
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("yaşınızı giriniz :");
        int age = input.nextInt();
        try(Exception e) {
            chechAge(age);
        }catch (Exception e){
            System.out.println("yaşınınız uymadı ");
        }

        System.out.println("program bitti ");
*/
    }
}
