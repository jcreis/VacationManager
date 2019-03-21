package backendspring.vacationmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity @Table(name = "USERS")
public class User {

    @GeneratedValue @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;

    @ManyToOne @JsonIgnore
    private Vacation vacation;

    // List of payments the user has to pay
    //private List<Payment> debt;

    // List of payments the user has to receive money from
    //private List<Payment> toReceive;

    // List of bills where the user is a debtor (ows money)
    @ManyToMany(mappedBy = "debtors")
    private Set<Bill> asDebtor = new HashSet<Bill>();

    // List of bills where the user is a payer (waiting to receive money)
    @ManyToMany(mappedBy = "payers")
    private Set<Bill> asPayer = new HashSet<Bill>();

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    /*
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

    public List<Bill> getAsDebtor() {
        return asDebtor;
    }

    public void setAsDebtor(List<Bill> asDebtor) {
        this.asDebtor = asDebtor;
    }

    public List<Bill> getAsPayer() {
        return asPayer;
    }

    public void setAsPayer(List<Bill> asPayer) {
        this.asPayer = asPayer;
    }*/
}
