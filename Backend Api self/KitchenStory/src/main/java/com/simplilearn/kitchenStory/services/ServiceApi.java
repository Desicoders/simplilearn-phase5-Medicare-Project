package com.simplilearn.kitchenStory.services;

import java.util.List;

public interface ServiceApi <E>{

	public E get(long id);
	public List<E> getAll();
	public E save(E obj);
	public String delete(long id);
	public String delete(E obj);
	public E update(long id,String FieldName,Object Value);

}
