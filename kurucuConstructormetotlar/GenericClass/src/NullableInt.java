public class NullableInt {
    private final Integer value;

    public Integer getValue() {
        return value;
    }

    public NullableInt(Integer value) {
        this.value = value;
    }

    public boolean isNull() {
        return this.getValue() == null;

    }

    public void run() {
        if (isNull()) {
            System.out.println("Bu değişkene deger atanmamıştır.");

        } else {
            System.out.println(this.getValue());
        }
    }

}


