package library;
import library.model.Book;
import library.model.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public boolean addBook(Book book){
        //TODO
        books.add(book);
        return false;
    }
    public boolean addBook(BookDetails bookDetails){
        //TODO
        return false;
    }
    public List<Book> getAllBooks(){
        //TODO
        return null;
    }
    public List<Book> getBooksByAuthor(String name, String surname){
        //TODO
        return null;
    }

    public Book getBookById(int id){
        Book book = null;
        for(Book b : books){
            if (b.getId() == id){
                book = b;
                break;
            }
        }
        return book;
    }
}
