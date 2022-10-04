package com.simplilearn.kitchenStory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.kitchenStory.entities.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
