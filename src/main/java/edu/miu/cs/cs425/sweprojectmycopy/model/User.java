package edu.miu.cs.cs425.sweprojectmycopy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "First name is required")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Column(nullable = false)
    private String lastName;

    @Email
    @NotBlank(message = "Email is required")
    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Password is required")
    @Column(nullable = false)
    private String password;

    private String phoneNum;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name = "USER_ID",referencedColumnName = "userId")},
            inverseJoinColumns = {@JoinColumn(name = "ROLE_ID",referencedColumnName = "roleId")})
    private List<Role> roles;

    @OneToMany(mappedBy = "user")
    private List<Address> address;

    @OneToMany(mappedBy = "user")
    private List<PaymentInfo> paymentInfoList;

    @OneToOne
    @JoinColumn(name = "shopping_cart_Id")
    private ShoppingCart ShoppingCart;

    @OneToMany(mappedBy = "user")
    private List<Review> review;

}
