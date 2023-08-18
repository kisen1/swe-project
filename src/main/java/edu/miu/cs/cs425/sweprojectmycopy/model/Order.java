package edu.miu.cs.cs425.sweprojectmycopy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name= "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;

    private String orderStatus;

    @NotBlank(message = "Date created is required")
    @Column(nullable = false)
    @DateTimeFormat(pattern= "yyyy-mm-dd")
    private LocalDate createdAt;

    @NotBlank(message = "Price is required")
    @Column(nullable= false)
    private double price;

//    @OneToMany(mappedBy = "order")
//    private List<Product> productList;

    @OneToOne
    private User owner;

    public Order(String orderStatus, LocalDate createdAt, double price, User owner) {
        this.orderStatus = orderStatus;
        this.createdAt = createdAt;
        this.price = price;
        this.owner = owner;
    }


//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void addProduct(Product product) {
//        productList.add(product);
//    }
//
//    public Product removeProduct(int index) {
//        Product temp = productList.get(index);
//        productList.remove(index);
//        return temp;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
}
