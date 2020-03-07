package library.model;

import java.util.List;

public class Book {
    private final BookDetails details;
    private final int id;

    public Book(BookDetails details, int id) {
        this.details = details;
        this.id = id;
    }

    public List<Author> getAuthors() {
        return details.getAuthors();
    }

    public String getTitle() {
        return details.getTitle();
    }

    public int getId() {
        return id;
    }


}
