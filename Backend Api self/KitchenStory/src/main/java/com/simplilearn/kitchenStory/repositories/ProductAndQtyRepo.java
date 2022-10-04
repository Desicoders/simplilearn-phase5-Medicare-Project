package com.simplilearn.kitchenStory.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.kitchenStory.entities.Product;
import com.simplilearn.kitchenStory.entities.ProductAndQty;

public interface ProductAndQtyRepo extends JpaRepository<ProductAndQty,Long>{
	Optional<ProductAndQty> findByProduct(Product product);
}
