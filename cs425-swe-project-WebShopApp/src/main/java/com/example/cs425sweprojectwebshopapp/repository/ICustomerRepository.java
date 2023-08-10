package com.example.cs425sweprojectwebshopapp.repository;

import com.example.cs425sweprojectwebshopapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long>{

}
