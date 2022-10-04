package com.simplilearn.kitchenStory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.kitchenStory.entities.Cart;
@Repository
public interface CartRepo extends JpaRepository<Cart, Long>{

}
