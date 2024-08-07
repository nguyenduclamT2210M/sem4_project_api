package org.example.sem4_project_api.Model;

import jakarta.persistence.*;
import org.hibernate.sql.ast.tree.expression.Star;

import java.util.List;

@Entity
public class Rateting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false )
    private Star star;
    public enum Star{
        One, Two, Three, Four, Five
    }
    @Column(nullable = false )
    public String description;
    @Column(nullable = false )
    @OneToMany(fetch = FetchType.EAGER)
    private List<Customer> customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}
