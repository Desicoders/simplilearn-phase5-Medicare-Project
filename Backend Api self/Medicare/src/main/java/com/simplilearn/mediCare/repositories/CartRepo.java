package com.simplilearn.mediCare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.mediCare.entities.Cart;
@Repository
public interface CartRepo extends JpaRepository<Cart, Long>{

}
