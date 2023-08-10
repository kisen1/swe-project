package com.example.cs425sweprojectwebshopapp.repository;

import com.example.cs425sweprojectwebshopapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Long>{

}
