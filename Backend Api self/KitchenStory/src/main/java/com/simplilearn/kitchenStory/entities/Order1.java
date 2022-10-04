package com.simplilearn.kitchenStory.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import com.simplilearn.kitchenStory.repositories.CartRepo;
import com.simplilearn.kitchenStory.user.User1;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Component
@Scope("prototype")
@Entity
@Data
@EqualsAndHashCode(of = {"id","user"})
public class Order1 {
	
	@Transient
	@Autowired
	Cart cart;

	@Autowired
	@Transient
	CartRepo cartRepo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	private User1 user1=cart.getUser();
	
	@OneToMany
	private Set<ProductAndQty> productsAndQty=cart.getProductsAndQty();
	
	@UpdateTimestamp
	private LocalDateTime orderTimeStamp;
	
	@OneToMany
	List<Status> orderStatus=new ArrayList<>();
	
	public Order1(String Statusmsg){
		Status status=new Status();
		status.setStatusMsg(Statusmsg);
		this.orderStatus.add(status);
		Set<ProductAndQty> productsAndQty1=new HashSet<>();
		cart.setProductsAndQty(productsAndQty1);
		cartRepo.save(cart);
		}
	
}
