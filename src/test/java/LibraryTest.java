import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library; //both need referenced to be used
    private Borrower borrower;


    @Before
    public void before(){
        book = new Book("Moby Dick", "Craig Rankin","Action");
        library = new Library(10);
        borrower = new Borrower();

    }

    @Test
    public void bookHasTitle(){
        assertEquals("Moby Dick", book.getName());
    }

    @Test
    public void libraryHasBooks(){
        assertEquals(0, library.numOfBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook();
        assertEquals(1, library.numOfBooks());
    }

    @Test
    public void canCheckCapacity(){
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        library.addBook();
        assertEquals(10, library.numOfBooks());
    }

    @Test
    public void canBookTransfer(){
        library.addBook();
        library.addBook();
        library.rentBook();
        assertEquals(1, library.numOfBooks());
        assertEquals(1, borrower.numOfBooksBorrowed());


    }


}
