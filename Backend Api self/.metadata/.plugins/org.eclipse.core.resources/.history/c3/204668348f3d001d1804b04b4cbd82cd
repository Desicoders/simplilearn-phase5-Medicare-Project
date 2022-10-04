package com.simplilearn.kitchenStory.services;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.simplilearn.kitchenStory.entities.ProductAndQty;
import com.simplilearn.kitchenStory.exceptions.ProductAndQtyNotFoundException;
import com.simplilearn.kitchenStory.repositories.ProductAndQtyRepo;
@Service
public class ProductAndQtyServiceImpl implements ServiceApi<ProductAndQty> {

	@Autowired
	ProductAndQtyRepo productAndQtyRepo;
	
	@Override
	public ProductAndQty get(long id) {
		return productAndQtyRepo.findById(id).orElseThrow(()->new ProductAndQtyNotFoundException("No such Item Ordred"));
	}

	@Override
	public List<ProductAndQty> getAll() {
		return productAndQtyRepo.findAll();
	}

	@Override
	public ProductAndQty save(ProductAndQty obj) {
		productAndQtyRepo.save(obj);
		return obj;
	}

	@Override
	public String delete(long id) {
		 productAndQtyRepo.deleteById(id);
		 return "Products and Quantity deleted with id ="+id;
	}

	@Override
	public String delete(ProductAndQty obj) {
		productAndQtyRepo.delete(obj);
	    return "Products and Quantity deleted with id ="+obj.getId();
	}

	@Override
	public ProductAndQty update(long id, String FieldName, Object Value) {
		ProductAndQty productAndQty=get(id);
		Field field=ReflectionUtils.findField(productAndQty.getClass(), FieldName);
		field.setAccessible(true);
		ReflectionUtils.setField(field, productAndQty, Value);
		productAndQtyRepo.save(productAndQty);
		return productAndQty;
	}

}
