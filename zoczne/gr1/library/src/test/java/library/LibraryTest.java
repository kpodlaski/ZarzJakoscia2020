package library;


import library.model.Author;
import library.model.Book;
import library.model.BookDetails;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @org.junit.Before
    public void setUp() throws Exception {
        library = new Library();
        Author a = new Author("Adam", "Mickiewicz");
        BookDetails bd = new BookDetails(a, "Pan Tadeusz");
        Book b = new Book(bd,1);
        Field booksField = Library.class.getDeclaredField("books");
        booksField.setAccessible(true);
        List<Book> books = (List<Book>) booksField.get(library);
        books.add(b);
        books.add(new Book(bd,2));
        a = new Author("Andrzej", "Sapkowski");
        bd = new BookDetails(a, "Krew Elfów");
        books.add(new Book(bd, 3));
        booksField.setAccessible(false);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        //Intentionally left empty
    }

    @org.junit.Test
    public void getBookByIdBookExists() {
        Book b = library.getBookById(2);
        //Book is not null
        //assertNotNull(b);
        //Single author
        assertEquals(1,b.getAuthors().size());
        //Check author name
        assertEquals("Adam",b.getAuthors().get(0).getName());
        //Check author surname
        assertEquals("Mickiewicz",b.getAuthors().get(0).getSurname());
        //Check title
        assertEquals("Pan Tadeusz",b.getTitle());
        //Check id
        assertEquals(2,b.getId());
    }
    @org.junit.Test
    public void getBookByIdBookDoesNotExist(){
        Book b = library.getBookById(5);
        assertNull(b);
    }
}