public class geneticNullable<T> {
    private final T value;

    public geneticNullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isaNull() {
        return this.getValue() == null;

    } public  void  run(){
        if(isaNull()){
            System.out.println("bu degişkene deger atanmamıltır");

        }else {
            System.out.println(this.getValue());
        }
    }
}

