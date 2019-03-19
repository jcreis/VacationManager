package backendspring.vacationmanager.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity @Table(name = "VACATIONS")
public class Vacation {

    @GeneratedValue
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    // List of users invited to the vacation
    @OneToMany(mappedBy = "vacation")
    private Set<User> userList = new HashSet<User>();

    // List of bills during the vacation
    @OneToMany(mappedBy = "vacation")
    private Set<Bill> bills = new HashSet<Bill>();


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

    public Set<User> getUserList() {
        return userList;
    }

    public void setUserList(Set<User> userList) {
        this.userList = userList;
    }

    public Set<User> addUser(User user){
        System.out.println("User id: " + user.getId());
        this.userList.add(user);
        return userList;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }

    public Vacation(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
