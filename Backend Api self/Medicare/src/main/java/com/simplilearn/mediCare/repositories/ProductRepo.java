package com.simplilearn.mediCare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.mediCare.entities.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
