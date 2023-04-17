public class Daire {
    public  int r ;
    public   final static  double pi = 3.14;

    public Daire(int r) {
        this.r = r;
    }public void  calcArea(){
     double area = pi*this.r*this.r;
        System.out.println("dairenin alanı ; "  + area);
    }
}
