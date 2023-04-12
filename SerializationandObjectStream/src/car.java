import java.io.Serializable;

public class car implements Serializable {
   private  String band ;
   private  String model ;

    public String getBand() {
        return band;
    }

    public String getModel() {
        return model;
    }

    public  car(String band , String model ){
        this.band = band ;
        this.model = model ;

    }

}
