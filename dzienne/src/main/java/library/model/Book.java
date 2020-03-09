package library.model;

import java.util.List;
import java.util.Objects;

public class Book {
    private int id;
    private BookDetails bookDetails;

    public Book(int id, BookDetails bookDetails) {
        this.id = id;
        this.bookDetails = bookDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Author> getAuthors() {
        return bookDetails.getAuthors();
    }

    public void setAuthors(List<Author> authors) {
        bookDetails.setAuthors(authors);
    }

    public String getTitle() {
        return bookDetails.getTitle();
    }

    public void setTitle(String title) {
        bookDetails.setTitle(title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                bookDetails.equals(book.bookDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookDetails);
    }
}
