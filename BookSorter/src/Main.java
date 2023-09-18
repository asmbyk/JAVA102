import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        Book b1 = new Book("Budala", 779, "F. M. Dostoyevski", "1868");
        Book b2 = new Book("ahmetkiat", 23432, "viktfor", "1965");
        Book b3 = new Book("yusufelkitabı", 12312, "aaaaa", "2005");
        Book b4 = new Book("kayık", 12344, "asım", "2003");
        Book b5 = new Book("itayla", 123, "Viktor", "2002");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        System.out.println("Order By Name");
        for (Book bookName : books) {
            System.out.println("Book Name: " + bookName.getBookName() +
                    "\nNumber of page: " + bookName.getPageNumber() +
                    "\nAuthor Name: " + bookName.getAuthorName() +
                    "\nReleased Date: " + bookName.getPublishDate());

        }
        System.out.println("  ");
        TreeSet<Book> books1 = new TreeSet<>(new OrderPageNumberComparator());
        books1.add(b1);
        books1.add(b2);
        books1.add(b3);
        books1.add(b4);
        books1.add(b5);
        System.out.println("Order by Page");
        for (Book pageNumber : books1) {
            ("Book Name: " + pageNumber.getBookName() +  "\nNumber of page: " + pageNumber.getPageNumber() + "\nAuthor Name: " + pageNumber.getAuthorName() + "\nReleased Date: " + pageNumber.getPublishDate();

        }

    }
}