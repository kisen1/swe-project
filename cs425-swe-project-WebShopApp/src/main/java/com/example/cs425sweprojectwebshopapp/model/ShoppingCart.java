package com.example.cs425sweprojectwebshopapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue
    private int cartID;
    private Customer customer;
    private List<Product> productList;

    public ShoppingCart() {

    }

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product removeProduct(int index) {
        Product temp = productList.get(index);
        productList.remove(index);
        return temp;
    }

    public int getCartID() {
        return cartID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
