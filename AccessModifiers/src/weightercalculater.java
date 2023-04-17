import java.util.function.ToDoubleBiFunction;

public class weightercalculater {
    private String isim;
    private int yas;
    private double kilo;
    private double boy;
    public static final double kpp = 0.45359237;
    public static final double mpi = 0.0254;

    public weightercalculater(String isim, int yas, double kilo, double boy) {
        this.boy = boy;
        this.isim = isim;
        this.kilo = kilo;
        this.yas = yas;


    }

    public weightercalculater(String isim, double kilo, double boy) {
        this(isim, 20, boy, kilo);
    }

    public weightercalculater() {

    }

    public double getWeighter() {
        double bki = kilo * kpp / ((boy * mpi) * (boy * mpi));
        return Math.round(bki * 100) / 100.0;

    }

    public String gerDurum() {
        double bki = getWeighter();
        if (bki < 25) return "normal";
        else if (bki < 30) return "kilolu ";
        else if (bki < 18.5) return "zayıf";
        else return "obez";


    }

    public String getIsim() {
        return isim;

    }

    public int getYas() {
        return yas;
    }

    public double getKilo() {
        return kilo;

    }

    public double getBoy() {
        return boy;
    }
}
