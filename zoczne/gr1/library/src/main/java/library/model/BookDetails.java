package library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookDetails {
    private List<Author> authors;
    private String title;

    public BookDetails(Author author, String title){
        authors = new ArrayList<>();
        authors.add(author);
        this.title=title;
    }

    public BookDetails(List<Author> authors, String title) {
        this.authors = authors;
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDetails that = (BookDetails) o;
        return authors.equals(that.authors) &&
                title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authors, title);
    }
}
