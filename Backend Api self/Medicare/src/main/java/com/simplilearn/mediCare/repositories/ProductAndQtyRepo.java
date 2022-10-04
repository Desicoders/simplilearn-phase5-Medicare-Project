package com.simplilearn.mediCare.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.mediCare.entities.Product;
import com.simplilearn.mediCare.entities.ProductAndQty;

public interface ProductAndQtyRepo extends JpaRepository<ProductAndQty,Long>{
	Optional<ProductAndQty> findByProduct(Product product);
}
