public class Main {
    public static void main(String[] args) {
        weightercalculater bki1 = new weightercalculater("elif",20,55,176);
        System.out.println(bki1.getIsim() + " BKi degeri " +  bki1.getWeighter() +" ;:" + bki1.gerDurum());
        weightercalculater bki2 = new weightercalculater("yusuf",21,150,165);
        System.out.println(bki2.getIsim()+ " bki degeri " + bki1.getWeighter() + " ;" + bki1.gerDurum());


    }
}