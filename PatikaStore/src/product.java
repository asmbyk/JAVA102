public class product  <T> implements  IProduct{
    private  int id ;
    private  int nextId;
    private  String brand;
    private  double unitPrice;
    private  double discount;
    private  int stock;
    private  String description;
    private  int memory;
    private  double size;
    private  int ram ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public product(int id, int nextId, String brand, double unitPrice, double discount, int stock, String description, int memory, double size, int ram) {
        this.id = id;
        this.nextId = nextId;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stock = stock;
        this.description = description;
        this.memory = memory;
        this.size = size;
        this.ram = ram;
    }
}
