package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinelearning.web.mvc.model.CourseText;
import com.onlinelearning.web.mvc.repository.CourseTextRepository;

public class CourseTextService implements Service<CourseText> {

	private final CourseTextRepository repository;
	@Autowired
	public CourseTextService(CourseTextRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseText save(CourseText entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseText update(CourseText entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseText entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseText findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseText> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
