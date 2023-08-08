package com.example.cs425sweprojectwebshopapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private int orderID;
    private List<Product> productList;
    private Customer customer;

    public Order() {

    }

    public Order(Customer customer) {

    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product removeProduct(int index) {
        Product temp = productList.get(index);
        productList.remove(index);
        return temp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
