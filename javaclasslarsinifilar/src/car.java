public class car {
    // nitelikler
    String models;
    String type ;
    String  color;
    int speed;
    //davranıslar ;
    int speedLimit = 100;
    car(){
        System.out.println("nesne olusturuldu ;");
    }
    void increseSpeed(int increment){
       if( speedLimit + speed<=speed) speed += increment;
    }
    void decreaseSpeed(int decrease){
      if(speed >0)  speed -= decrease;
    } void printSpeed(){
        System.out.println( models + "arabanın hızı   ; " + speed);
    }
}
