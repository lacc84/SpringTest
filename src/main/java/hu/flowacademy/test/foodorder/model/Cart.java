package hu.flowacademy.test.foodorder.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     @ManyToOne
    private User user;

    @Column
    private LocalDateTime orderDate;

    @OrderColumn
    @ManyToMany
    private Food[] foods;

    public Cart() {
    }

    public Cart(long id, User user, LocalDateTime orderDate, Food[] foods) {


        this.id = id;
        this.user = user;
        this.orderDate = orderDate;
        this.foods = foods;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }
}
