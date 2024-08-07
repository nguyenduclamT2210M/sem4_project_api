package org.example.sem4_project_api.Model;


import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private AppOrder order;
    @ManyToOne(fetch = FetchType.EAGER)
    private Dish dish;
    @Column(nullable = false )
    private int quantity;

    public AppOrder getOrder() {
        return order;
    }

    public void setOrder(AppOrder order) {
        this.order = order;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

}
