import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("The Far Side Gallery 5", "Gary Larson", "Comics");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Far Side Gallery 5", book.getTitle());
    }
    @Test
    public void hasGenre() {
        assertEquals("Comics", book.getGenre());
    }
    @Test
    public void hasAuthor() {
        assertEquals("Gary Larson", book.getAuthor());
    }
}
