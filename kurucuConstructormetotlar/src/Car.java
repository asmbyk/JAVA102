public class Car {
    String model ;
    String color ;
    int maxSpeed;
    int speed ;
    Car(String model , String color ,int maxSpeed , int speed){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    void hizarttir( int art) {
       this.speed +=art ;
    }
}
