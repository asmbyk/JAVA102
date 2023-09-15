import java.util.Comparator;

public class OrderNoteComparable implements Comparator<Student> {

    //2 parametre alacak  her neyleyi karsılatırıp sıralama yapacak
    @Override
    public int compare(Student o1, Student o2) {

        return o1.getNote()- o2.getNote(); // note sıralamasını sagladık
    }
}

