import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int numOfBooksBorrowed() {
       return collection.size();

    }

    public void rentBook(Book book){
        collection.add(book);
    }





}
