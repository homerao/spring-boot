package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



public interface Service<T> {
	
	public T save( T entitydto);
	
	public T update( T entitydto);
	
	public void delete( T entitydto);
	
	public T findOne( Long id);
	
	public List<T> findAll();

}
