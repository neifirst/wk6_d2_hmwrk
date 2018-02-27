import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Colour of Magic", GenreType.FANTASY);
    }




    @Test
    public void hasTitle(){
        assertEquals("The Colour of Magic", book.getTitle());
    }

    @Test
    public void hasGenre(){
        assertEquals(GenreType.FANTASY, book.getGenre());
    }

    @Test
    public void genreHasBlurb(){
        assertEquals("Dragons and shiz", book.getBlurbFromEnum());
    }

    @Test
    public void canGetAllGenres(){
        GenreType[] expected = {GenreType.THRILLER, GenreType.CRIME, GenreType.HORROR, GenreType.FANTASY, GenreType.SCIFI};
        GenreType[] genres = GenreType.values();
        assertEquals(5, genres.length);
        assertArrayEquals(expected, genres);
    }
}
