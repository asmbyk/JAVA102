package finalson;
//Kendisine parametre olarak gelen stringteki "a" karakterinin olup olmadığını geri döndüren metod.
public class ornek13 {
    public static String avar(String a ){
        int sayac  =0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)== 'a') sayac ++;
        }if( sayac >0) return "a karakteri varıdr";
        else return " a karakteri yoktur";
    }

    public static void main(String[] args) {
        System.out.println(avar("hmet veli"));
    }
}
