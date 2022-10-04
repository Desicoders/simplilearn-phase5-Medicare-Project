package com.simplilearn.mediCare.entities;

import javax.persistence.CascadeType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@OneToOne(cascade = CascadeType.ALL)
	Product product;
	Long qty;
	
	Long productAndQtyPrice;
	
	public ProductAndQty(Product p)
	{
		this.product=p;
		this.qty=1l;
		productAndQtyPrice=product.get_price()*qty;
	}
	public ProductAndQty(Product p,long qty)
	{
		this.product=p;
		this.qty=qty;
		productAndQtyPrice=product.get_price()*qty;
	}
	public void updateProductAndQtyPrice()
	{
		this.productAndQtyPrice=this.product.get_price()*this.qty;
	}
}
