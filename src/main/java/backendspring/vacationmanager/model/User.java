package backendspring.vacationmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User {

    @GeneratedValue @Id
    private long id;

    private String name, phoneNumber, email;

    private List<Payment> debt;

    private List<Payment> toReceive;

    public User(String name, String phoneNumber, String email, List<Payment> debt, List<Payment> toReceive) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.debt = debt;
        this.toReceive = toReceive;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Payment> getDebt() {
        return debt;
    }

    public void setDebt(List<Payment> debt) {
        this.debt = debt;
    }

    public List<Payment> getToReceive() {
        return toReceive;
    }

    public void setToReceive(List<Payment> toReceive) {
        this.toReceive = toReceive;
    }
}
