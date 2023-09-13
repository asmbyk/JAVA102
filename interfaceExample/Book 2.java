public class Book {
    private String name;
    private int PageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        this.PageNumber = pageNumber;
    }

    public int getPageNumber() {
        if( PageNumber <0){
            PageNumber =0;
        }
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.PageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String setName) {
        this.name = setName;
    }
}
