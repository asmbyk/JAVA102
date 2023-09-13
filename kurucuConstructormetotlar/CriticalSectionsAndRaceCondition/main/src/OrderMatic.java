public class OrderMatic implements Runnable {
    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic() {
        this.orderNo = 1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        increasedOrher();
         synchronized (LOCK) {
              //this.orderNo++; // aynı threade olmaması için snchrozied cözümleri
           //  System.out.println(Thread.currentThread().getName() + " - Order no :  " + this.orderNo);
        }
    }
    public  void  increasedOrher(){
        this.orderNo++; // aynı threade olmaması için snchrozied cözümleri
        System.out.println(Thread.currentThread().getName() + " - Order no :  " + this.orderNo);
    }
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
