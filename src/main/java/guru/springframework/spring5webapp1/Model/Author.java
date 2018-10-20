package guru.springframework.spring5webapp1.Model;

import java.util.HashSet;
import java.util.Set;
import javax.peresistance.*;



@Entity
public class Author{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    @ManyToMany

    private Set<Book> books =new HashSet<>();
    public Author(){

    }
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


    }
    public Author(String firstName, String lastName, Set<Book> books ){

        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public Set<Book> getBooks() { return books; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setBooks(Set<Book> books) {this.books = books; }
}