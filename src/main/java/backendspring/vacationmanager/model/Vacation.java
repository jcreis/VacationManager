package backendspring.vacationmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Vacation {

    @GeneratedValue
    @Id
    private long id;

    private String title;
    private String description;

    // List of users invited to the vacation
    //private List<User> userList;

    // List of bills during the vacation
    //private List<Bill> bills;


    public Vacation() {
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

    /*public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
*/
    public Vacation(String title, String description/*, List<User> userList, List<Bill> bills*/) {
        this.title = title;
        this.description = description;
        //this.userList = userList;
        //this.bills = bills;
    }
}
