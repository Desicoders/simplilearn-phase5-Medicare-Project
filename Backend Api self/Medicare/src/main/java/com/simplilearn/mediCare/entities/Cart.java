package com.simplilearn.mediCare.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.simplilearn.mediCare.user.User1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@NotEmpty
	@OneToMany(cascade = CascadeType.ALL)
	private Set<ProductAndQty> productsAndQty=new HashSet<>();
	
	private double price=0.0;
	
	public void calculatePrice()
	{
	
		productsAndQty.forEach(productAndQty->this.price+=productAndQty.getProductAndQtyPrice());
	}
	
}
