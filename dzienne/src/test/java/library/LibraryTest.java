package library;

import library.model.Author;
import library.model.Book;
import library.model.BookDetails;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @org.junit.Before
    public void setUp() throws Exception {
        library = new Library();
        BookDetails bd = new BookDetails(
                new Author("Adam", "Mickiewicz"),
                "Pan Tadeusz"
        );
        Book b = new Book(1, bd);
        library.addBook(b);
        library.addBook(new Book(2,bd));
        bd = new BookDetails(
                new Author("Henryk","Sienkiewicz"),
                "Krzyżacy");
        library.addBook(new Book(3,bd));
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getBookByIdTestCase1() {
        Book book = library.getBookById(2);
        //Czy nie null
        assertNotNull(book);
        //Czy id == 2
        assertEquals(2, book.getId());
        //Czy tylko jeden autor
        assertEquals(1, book.getAuthors().size());
        //Czy Adam Mickiewicz
        assertEquals("Adam",book.getAuthors().get(0).getName());
        assertEquals("Mickiewicz",book.getAuthors().get(0).getSurname());
        //Czy Pan Tadeusz
        assertEquals("Pan Tadeusz", book.getTitle());
    }
    @org.junit.Test
    public void getBookByIdTestCase2(){
        Book b = library.getBookById(7);
        assertNull(b);
    }
}