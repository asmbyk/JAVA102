public abstract class Tv implements  televizyon, elektriklialet{
    int ses =30;
    int max= 100;
    int min = 0 ;
    @Override
    public void ac(){
        System.out.println("tv acılıyor");
    }

    @Override
    public void kapa() {
        System.out.println("tv kapanıyor ");
    }

    @Override
    public void sesAc() {
        this.ses = 30 ;

    }

    @Override
    public void sesKapa() {
        this.ses = 0;
    }

    @Override
    public void sesKis() {
        this.ses -=1;
    }

    @Override
    public void sesArttir() {
        this.ses += 1;
    }
}
