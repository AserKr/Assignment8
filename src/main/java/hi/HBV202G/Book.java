package hi.HBV202G;

import java.util.List;

public class Book{
    private List<Author> authors;
    private String title;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }



    public Book(String name, List<Author> authors) {
        this.title = name;
        this.authors = authors;

    }
}
