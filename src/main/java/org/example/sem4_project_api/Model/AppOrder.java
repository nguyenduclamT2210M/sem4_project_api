package org.example.sem4_project_api.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;


import java.util.Date;
import java.util.List;

@Entity
public class AppOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
    @ManyToOne(fetch = FetchType.EAGER)
    private RestaurantTable table;
    @Column(nullable = false )
    private Date bookingTime;
    @Column(nullable = true )
    @OneToMany(fetch = FetchType.EAGER)
    private List<Coupon> coupon;
    @Column(nullable = false )
    private Date create_at;
    @Column(nullable = false )
    private PaymentMethod payment;
    public enum PaymentMethod {
        Cash, CreditCard, MobilePayment, BankTransfer
    }
    @Column(nullable = false )
    private StatusOrder status;
    public enum StatusOrder {
        PendingPayment, Paid, Failed
    }
    @Column(nullable = false )
    private double originalPrice;
    @Column(nullable = false )
    public double totalDiscount;
    @Column(nullable = false )
    private double totalPrice;

    public int getId() {
        return id;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }



    public StatusOrder getStatus() {
        return status;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RestaurantTable getTable() {
        return table;
    }

    public void setTable(RestaurantTable table) {
        this.table = table;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public List<Coupon> getCoupon() {
        return coupon;
    }

    public void setCoupon(List<Coupon> coupon) {
        this.coupon = coupon;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
