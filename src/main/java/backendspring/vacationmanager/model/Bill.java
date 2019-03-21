package backendspring.vacationmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity @Table(name = "BILLS")
public class Bill {

    @GeneratedValue @Id
    private long id;

    private String title;
    private String description;
    private double price;

    @ManyToOne @JsonIgnore
    private Vacation vacation;

    // List of users who paid the bill in the first place
    @ManyToMany
    private Set<User> payers = new HashSet<User>();

    @ManyToMany
    // List of users who have to pay the bill to the payers
    private Set<User> debtors = new HashSet<User>();

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


    public Set<User> getPayers() {
        return payers;
    }

    public void setPayers(Set<User> payers) {
        this.payers = payers;
    }

    public Set<User> addPayer(User payer){
        this.payers.add(payer);
        return payers;
    }

    public Set<User> getDebtors() {
        return debtors;
    }

    public void setDebtors(Set<User> debtors) {
        this.debtors = debtors;
    }

    public Set<User> addDebtor(User debtor){
        this.debtors.add(debtor);
        return debtors;
    }
}
