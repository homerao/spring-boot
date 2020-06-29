package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinelearning.web.mvc.model.CourseOrderItem;
import com.onlinelearning.web.mvc.repository.CourseOrderItemRepository;

public class CourseOrderItemService implements Service<CourseOrderItem> {

	private final CourseOrderItemRepository repository;
	@Autowired
	public CourseOrderItemService(CourseOrderItemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseOrderItem save(CourseOrderItem entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseOrderItem update(CourseOrderItem entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseOrderItem entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseOrderItem findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseOrderItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
