public class Nullable <T extends  Number>{ // bounded  yapmış olduk sadece numberdan türemiş extends edilmiş olması lazım
    private  final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public  boolean isNull(){
        return  this.getValue() == null;
    }
    public  void run(){
        if(isNull()){
            System.out.println("Bu degişgene değer atanmamıştır.(Null)");
        }else {
            System.out.println(this.value);
        }
    }
}
