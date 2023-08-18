package edu.miu.cs.cs425.sweprojectmycopy.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @NotBlank(message = "Product name is required")
    @Column(length = 50, nullable = false)
    private String name;

    @NotBlank(message = "Product price is required")
    @Column(nullable = false)
    private double price;

    @NotBlank(message = "Product description is required")
    @Column(nullable = false)
    private String description;

    private int quantity;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Review> reviews;

//    private Catagory catagory;


}
