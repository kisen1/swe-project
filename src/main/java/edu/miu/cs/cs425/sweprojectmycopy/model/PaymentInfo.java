package edu.miu.cs.cs425.sweprojectmycopy.model;

import edu.miu.cs.cs425.sweprojectmycopy.consant.PaymentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "payments")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;

    @NotBlank(message = "Required")
    @Column(nullable = false)
    private String cardholderName;

    private LocalDate expirationDate;

    @NotBlank(message = "Required")
    @Column(nullable = false, unique = true)
    private String cardNumber;

    @NotBlank(message = "Required")
    @Column(nullable = false)
    private String csv;

    @NotBlank(message = "Required")
    @Column(nullable = false)
    private PaymentType type;  //credit or debit or none

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
