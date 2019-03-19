package backendspring.vacationmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bill {

    @GeneratedValue @Id
    private long id;

    private String title;
    private String description;
    private double price;

    @ManyToOne @JsonIgnore
    private Vacation vacation;
    // List of users who paid the bill in the first place
    //private List<User> payers;

    // List of users who have to pay the bill to the payers
    //private List<User> debtors;

    public Bill(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;

    }

    public Bill() {
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

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    /*
    public List<User> getPayers() {
        return payers;
    }

    public void setPayers(List<User> payers) {
        this.payers = payers;
    }

    public List<User> getDebtors() {
        return debtors;
    }

    public void setDebtors(List<User> debtors) {
        this.debtors = debtors;
    }*/
}
