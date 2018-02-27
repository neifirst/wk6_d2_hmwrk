import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        book = new Book("The Colour of Magic", GenreType.FANTASY);
        borrower = new Borrower("Jeff Bridges");
        library = new Library(2);
        library.add(book);
    }




    @Test
    public void canBorrowBook() {
        assertEquals(1, library.stockCount());
        borrower.borrow(library);
        assertEquals(1, borrower.collectionSize());
        assertEquals(0, library.stockCount());
    }

}
