package com.simplilearn.kitchenStory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class ProductAndQty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@OneToOne
	Product product;
	Long qty;
	
	Long productAndQtyPrice;
	
	public ProductAndQty(Product p)
	{
		this.product=p;
		this.qty=1l;
		productAndQtyPrice=product.getPrice()*qty;
	}
	public ProductAndQty(Product p,long qty)
	{
		this.product=p;
		this.qty=qty;
		productAndQtyPrice=product.getPrice()*qty;
	}
}