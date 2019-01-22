package backendspring.vacationmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Bill {

    @GeneratedValue @Id
    private long id;

    private String title;
    private String description;
    private double price;

    // List of users who paid the bill in the first place
    private List<User> payers;

    // List of users who have to pay the bill to the payers
    private List<User> debters;

    public Bill(String title, String description, double price, List<User> payers, List<User> debters) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.payers = payers;
        this.debters = debters;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<User> getPayers() {
        return payers;
    }

    public void setPayers(List<User> payers) {
        this.payers = payers;
    }

    public List<User> getDebters() {
        return debters;
    }

    public void setDebters(List<User> debters) {
        this.debters = debters;
    }
}
