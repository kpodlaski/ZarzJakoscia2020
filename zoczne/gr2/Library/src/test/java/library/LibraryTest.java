package library;

import library.model.Author;
import library.model.Book;
import library.model.BookDetails;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library lib;

    @org.junit.Before
    public void setUp() throws Exception {
        Author a = new Author("Stanisław", "Lem");
        BookDetails bd = new BookDetails(a, "Solaris");
        Book b = new Book(bd,1);
        lib.addBook(b);
        lib.addBook(new Book(bd, 2));
        a = new Author("Władysław", "Reymont");
        bd = new BookDetails(a, "Chłopi");
        lib.addBook(new Book(bd,3));
    }

    @org.junit.After
    public void tearDown() throws Exception {
        //Left empty for future usage
    }

    @org.junit.Test
    public void getBookByIdTestCase1() {
        Book book = lib.getBookById(2);
        //Book not null
        assertNotNull(book);
        //check if id == 2
        assertEquals(2, book.getId());
        //check number of authors
        assertEquals(2,book.getAuthors().size());
        //check Author name/surname
        assertEquals("Stanisław",book.getAuthors().get(0).getName());
        assertEquals("Lem",book.getAuthors().get(0).getSurname());
        //Check title
        assertEquals("Solaris",book.getTitle());
    }

    @org.junit.Test
    public void getBookByIdTestCase2(){
        Book book = lib.getBookById(12);
        assertNull(book);
    }
}