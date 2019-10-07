package hu.flowacademy.test.foodorder.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

    @Id
    @Column
    private String userName;

    @Column
    private String fullName;

    @Column
    private String address;

    public User() {
    }

    public User(String userName, String fullName, String address) {
        this.userName = userName;
        this.fullName = fullName;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
