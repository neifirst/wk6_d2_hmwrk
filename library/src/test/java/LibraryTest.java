import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    private Library library;
    private Book book;


    @Before
    public void before(){
        book = new Book("The Colour of Magic", GenreType.FANTASY);
        library = new Library(2);
    }



    @Test
    public void getStockCount() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook() {
        library.add(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void canNotAddBook() {
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void canRemoveBook() {
        library.add(book);
        library.removeBook();
        assertEquals(0, library.stockCount());
    }

}
