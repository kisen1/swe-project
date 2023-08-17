package edu.miu.cs.cs425.sweprojectmycopy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @NotBlank(message = "Comment is required")
    @Column(nullable = false)
    private String comment;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

}
