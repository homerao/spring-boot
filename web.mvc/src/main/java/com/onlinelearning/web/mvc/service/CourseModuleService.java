package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinelearning.web.mvc.repository.CourseModuleRepository;

public class CourseModuleService implements Service<CourseModuleService> {

	private final CourseModuleRepository repository;
	@Autowired
	public CourseModuleService(CourseModuleRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseModuleService save(CourseModuleService entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseModuleService update(CourseModuleService entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseModuleService entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseModuleService findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseModuleService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
