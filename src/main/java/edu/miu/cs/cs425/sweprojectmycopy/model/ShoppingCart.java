package edu.miu.cs.cs425.sweprojectmycopy.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartID;

    @OneToOne(mappedBy = "shoppingCart")
    private User buyer;

    @OneToMany
    @JoinColumn(name= "carts_products")
    private List<Product> productList;


}
