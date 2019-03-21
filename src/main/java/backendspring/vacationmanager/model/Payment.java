package backendspring.vacationmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "PAYMENTS")
public class Payment {

    @GeneratedValue @Id
    private long id;

    private double total;

    /*private User fromUser;

    private User toUser;*/

    public Payment(double total/*, User fromUser, User toUser*/) {
        this.total = total;
        /*this.fromUser = fromUser;
        this.toUser = toUser;*/
    }

    public Payment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /*public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }*/
}
