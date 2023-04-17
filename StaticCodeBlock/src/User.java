public class User {
    public  String name ;
    public  static  int  counter ; //0 diyebilirdik cok sık bir hata oldugu için otamatik kendisi deger atıyor .
    static {
        System.out.println("ben bir static kod bloguyum .");
        int random =  ( int ) (Math.random()*106);
        //System.out.println(random);
        counter = random;
    }
    public User(String name) {
        this.name = name;
        counter ++ ;
    }
}
