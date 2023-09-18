import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, sturdent> students = new TreeMap<>(new OrdarByNoCompra().reversed());
        students.put(102, new sturdent(102,"mustafa", 100));
        students.put(103, new sturdent(103,"ahmet", 60));
        students.put(104, new sturdent(104,"yusuf", 70));
        students.put(105, new sturdent(105,"güney", 40));
        for (sturdent stu : students.values()){
            System.out.println(stu.getName());

        }

    }
}