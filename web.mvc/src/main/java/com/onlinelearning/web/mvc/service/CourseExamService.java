package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.repository.CourseExamRepository;
@Component
@org.springframework.stereotype.Service
public class CourseExamService implements Service<CourseExamService> {

	private final CourseExamRepository repository;
	@Autowired
	public CourseExamService(CourseExamRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseExamService save(CourseExamService entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseExamService update(CourseExamService entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseExamService entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseExamService findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseExamService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
