package org.example.sem4_project_api.Model;

import jakarta.persistence.*;

@Entity
public class RestaurantTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false )
    private String qrCode;
    @Column(nullable = false )
    private int chairs;
    @Column(nullable = false )
    private StatusTable status;

    public enum StatusTable {
        Available, Occupied, Reserved, OutOfService
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getQrCode() {
        return qrCode;
    }

    public StatusTable getStatus() {
        return status;
    }

    public void setStatus(StatusTable status) {
        this.status = status;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }


}
