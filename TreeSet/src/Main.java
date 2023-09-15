import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>( new orderNameComparator() ); //isme göre sıralanaıs
        // TreeSet<Student> students = new TreeSet<>( new OrderNoteComparable().reversed() ); //rezersed  nota tersten sıralama
        /*
        hatırlatma
                Student s1 = new Student("Mustafa ,20 ");
                students.add (s1);
                aşagıdakiyle aynı sey daha kısa oldugu için böyle kullandık

        */
        students.add(new Student("Mustafa", 20));
        students.add(new Student("ahmet", 100));
        students.add(new Student("damla", 60));
        students.add(new Student("behlül", 60));
        students.add(new Student("Mustafa", 20));
        for (Student stu: students) {
            System.out.println(stu.getName());

        }

    }
}