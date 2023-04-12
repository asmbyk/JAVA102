package java101ornek;
/*
    //Kendisine parametre olarak gelen stringteki küçük karakterleri büyük,büyük karakterleri küçük yapan sonucu geri

 */
public class ornek11 {
    public  static String bK(String a){
        String a2 = "";
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i) > 'a' && a.charAt(i) < 'z') {
                //a2 = (char) (a.charAt(i) -32);
            }
        }return  a2;
    }
}
