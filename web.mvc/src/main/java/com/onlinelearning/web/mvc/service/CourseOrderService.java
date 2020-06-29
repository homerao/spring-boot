package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.CourseOrder;
import com.onlinelearning.web.mvc.repository.CourseOrderRepository;
@Component
@org.springframework.stereotype.Service
public class CourseOrderService implements Service<CourseOrder> {

	private final CourseOrderRepository repository;
	
	@Autowired
	public CourseOrderService(CourseOrderRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseOrder save(CourseOrder entitydto) {
		
		return null;
	}

	@Override
	public CourseOrder update(CourseOrder entitydto) {
		
		return null;
	}

	@Override
	public void delete(CourseOrder entitydto) {
		
		
	}

	@Override
	public CourseOrder findOne(Long id) {
		
		return null;
	}

	@Override
	public List<CourseOrder> findAll() {
		
		return null;
	}

}
