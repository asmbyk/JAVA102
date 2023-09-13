public class Counter implements Runnable{
    private   String name ;
  private  int id ;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Calıstı !");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000L*this.id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

        }

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
