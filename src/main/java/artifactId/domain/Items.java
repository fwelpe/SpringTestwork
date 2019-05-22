package artifactId.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String Name;
    private String Shelf;
    private String Box;

    public Items() {

    }

    public Items(String name, String shelf, String box) {
        Name = name;
        Shelf = shelf;
        Box = box;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShelf() {
        return Shelf;
    }

    public void setShelf(String shelf) {
        Shelf = shelf;
    }

    public String getBox() {
        return Box;
    }

    public void setBox(String box) {
        Box = box;
    }
}
