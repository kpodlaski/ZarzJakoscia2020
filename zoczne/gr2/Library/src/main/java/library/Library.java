package library;

import library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    /*
        method adds Book to a list books and then return true
        method so not add the same book twice and then return false
        method do not allow a book to have empty list of authors and then return false
        method do not allow an author to have no name/surname and then return false
     */
    public boolean addBook(Book book){
        //TODO
        return false;
    }

    /*
        return null if book do not exist in list books
     */
    public Book getBookById(int id){
        //TODO
        return null;
    }

    public  List<Book> getBooksByAuthor(String name, String surname){
        //TODO
        return null;
    }

    public  List<Book> getBooksByTitle(String title){
        //TODO
        return null;
    }
}
