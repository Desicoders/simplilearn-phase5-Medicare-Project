package com.simplilearn.mediCare.entities;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartAndAddress {
	    int id;
	    Set<ProductAndQty> productsAndQty; 
	    long price;
	    String _streetNo;
	    String _houseNo;
	    String _locality;
	    String _district;
	    String _city;
	    String _state;
	    long _pincode;
	    String _country;
	}

