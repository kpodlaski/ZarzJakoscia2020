package library.model;

import java.util.List;
import java.util.Objects;

public class Book {
    private final BookDetails bookDetails;
    private final int id;

    public Book(BookDetails bookDetails, int id) {
        this.bookDetails = bookDetails;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Author> getAuthors() {
        return bookDetails.getAuthors();
    }

    public String getTitle() {
        return bookDetails.getTitle();
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
        return Objects.hash(bookDetails, id);
    }
}
