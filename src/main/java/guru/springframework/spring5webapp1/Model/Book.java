package guru.springframework.spring5webapp1.Model;

import java.util.HashSet;
import java.util.Set;
import javax.peresistance.*;


@Entity
public class Book{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String title;
    private String isbn;
    private String publisher;

    @ManyToMany
    private Set<Author> authors = new HashSet<>();

    public Book(){

    }
    public Book(String title, String isbn, String publisher){
        this.title = title;
        this.isbn = isbn;
        this.publisher=publisher;


    }
    public Book(String title, String isbn, String publisher, Set<author> authors){
        this.title = title;
        this.isbn = isbn;
        this.publisher=publisher;
        this.authors=authors;


    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public Set<Author> getAuthors() { return authors; }

    public String getIsbn() { return isbn; }

    public String getPublisher() { return publisher; }

    public String getTitle() { return title; }

    public void setAuthors(Set<Author> authors) { this.authors = authors; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

    public void setTitle(String title) { this.title = title; }
}