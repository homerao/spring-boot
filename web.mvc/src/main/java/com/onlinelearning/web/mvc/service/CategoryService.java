package com.onlinelearning.web.mvc.service;

import java.util.List;

import com.onlinelearning.web.mvc.model.Category;
import com.onlinelearning.web.mvc.repository.CategoryRepository;

public class CategoryService implements Service<Category> {

	private final CategoryRepository repository;
	
	
	public CategoryService(CategoryRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Category save(Category entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category update(Category entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Category entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
