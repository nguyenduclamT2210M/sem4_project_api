package org.example.sem4_project_api.Model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Block;

@Entity

public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false )
    private String name;
    @Column(nullable = false )
    private double price;
    @Column(nullable = false )
    private String image;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
    @Column(nullable = false )
    private StatusDish status;
    @Column(nullable = false )
    private String discount;

    public enum StatusDish {
        Available, OutOfStock
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public StatusDish getStatus() {
        return status;
    }

    public void setStatus(StatusDish status) {
        this.status = status;
    }
}
