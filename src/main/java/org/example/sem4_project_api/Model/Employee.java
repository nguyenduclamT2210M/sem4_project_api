package org.example.sem4_project_api.Model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false )
    private String fullName;
    @Column(nullable = false )
    private String name;
    @Column(nullable = false )
    private int age;
    @Column(nullable = false )
    private String email;
    @Column(nullable = false )
    private String phone;
    @Column(nullable = false )
    private String password;
    @Column(nullable = false )
    private boolean isAtWork;
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getPhone() {
        return phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAtWork() {
        return isAtWork;
    }

    public void setAtWork(boolean atWork) {
        isAtWork = atWork;
    }
}
