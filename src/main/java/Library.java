import java.util.ArrayList;

public class Library {


    private ArrayList<Book> books;
    private Book book;
    private int capacity;


    public Library(int capacity){
        this.books = new ArrayList<>();
        this.book = new Book("Moby Dick", "Craig Rankin", "Action");
        this.capacity = capacity;
    }

    public int numOfBooks() {
        return books.size();
    }

    public void addBook() {
        if(numOfBooks() < capacity){
        books.add(book);}

    }

    public void rentBook(Borrower borrower){
        Book book = borrower.rentBook(Book book);
    }



}
