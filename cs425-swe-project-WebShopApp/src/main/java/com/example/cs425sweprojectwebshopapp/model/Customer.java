package com.example.cs425sweprojectwebshopapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int customerID;
    private String name;
    private String email;
    private String phoneNum;
    private ShoppingCart cart;
    private Address address;
    private List<PaymentInfo> paymentInfoList;

    public Customer() {

    }

    public Customer(String name, String email, String phoneNum, Address address) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        cart = new ShoppingCart(this);
    }

    public void addPaymentInfo(PaymentInfo paymentInfo) {
        paymentInfoList.add(paymentInfo);
    }

    public PaymentInfo removePaymentInfo(int index) {
        PaymentInfo temp = paymentInfoList.get(index);
        paymentInfoList.remove(index);
        return temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public List<PaymentInfo> getPaymentInfoList() {
        return paymentInfoList;
    }
}
