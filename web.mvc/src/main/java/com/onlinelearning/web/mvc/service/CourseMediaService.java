package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.repository.CourseMediaRepository;
@Component
@org.springframework.stereotype.Service
public class CourseMediaService implements Service<CourseMediaService> {

	private final CourseMediaRepository repository;
	@Autowired
	public CourseMediaService(CourseMediaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseMediaService save(CourseMediaService entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseMediaService update(CourseMediaService entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseMediaService entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseMediaService findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseMediaService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
