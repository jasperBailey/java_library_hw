import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book2;

    @Before
    public void before() {
        library = new Library(20);
        book = new Book("The Far Side Gallery 5", "Gary Larson", "Comics");
        book2 = new Book("It Came From The Far Side", "Gary Larson", "Comics");
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cannotAddBookWhenFull() {
        Library smallLibrary = new Library(1);
        smallLibrary.addBook(book);
        smallLibrary.addBook(book2);
        assertEquals(1, smallLibrary.getBookCount());
    }
    
    @Test
    public void canRemoveBook()
}
