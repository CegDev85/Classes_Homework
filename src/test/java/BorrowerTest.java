import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Moby Dick","Craig Rankin", "Action");
        library = new Library(10);
    }

//    @Test
//    public void canBorrowABook(){
//        borrower.takeBook(book);
//        assertEquals(1, borrower.numOfBooksBorrowed());
//    }

    @Test
    public void canBorrowABook(){
        library.rentBook();
        assertEquals(1, borrower.numOfBooksBorrowed());
    }




}
