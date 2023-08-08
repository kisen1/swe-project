package com.example.cs425sweprojectwebshopapp.repository;

import com.example.cs425sweprojectwebshopapp.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {

}
