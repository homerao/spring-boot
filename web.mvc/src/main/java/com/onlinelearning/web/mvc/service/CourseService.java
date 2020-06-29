package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.Course;
import com.onlinelearning.web.mvc.repository.CourseRepository;
@Component
@org.springframework.stereotype.Service
public class CourseService implements Service<Course> {

	private final CourseRepository repository;
	@Autowired
	public CourseService(CourseRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Course save(Course entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course update(Course entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Course entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
