package com.example.cs425sweprojectwebshopapp.model;

import java.time.LocalDate;

public class PaymentInfo {
    private String cardholderName;
    private LocalDate expirationDate;
    private String CVV;
    private String cardNumber;

    public PaymentInfo(String cardholderName, LocalDate expirationDate, String cvv, String cardNumber) {
        this.cardholderName = cardholderName;
        this.expirationDate = expirationDate;
        CVV = cvv;
        this.cardNumber = cardNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
