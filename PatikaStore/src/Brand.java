public class Brand  implements Comparable<Brand> {
    private  final    int id ;
    private  static   int  nextId;
    private  String name ;

    public int getId() {
        return id;
    }


    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand(int id, int nextId, String name) {
        this.id = id;
        this.nextId = nextId;
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
