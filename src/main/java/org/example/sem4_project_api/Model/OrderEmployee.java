package org.example.sem4_project_api.Model;

import jakarta.persistence.*;

@Entity
public class OrderEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employee;
    @ManyToOne(fetch = FetchType.EAGER)
    private AppOrder order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public AppOrder getOrder() {
        return order;
    }

    public void setOrder(AppOrder order) {
        this.order = order;
    }
}
