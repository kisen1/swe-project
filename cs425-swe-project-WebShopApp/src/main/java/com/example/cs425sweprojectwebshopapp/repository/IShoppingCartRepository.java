package com.example.cs425sweprojectwebshopapp.repository;

import com.example.cs425sweprojectwebshopapp.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{

}
