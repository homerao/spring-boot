package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinelearning.web.mvc.model.CourseQuestion;
import com.onlinelearning.web.mvc.repository.CourseQuestionRepository;

public class CourseQuestionService implements Service<CourseQuestion> {

	private final CourseQuestionRepository repository;
	@Autowired
	public CourseQuestionService(CourseQuestionRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseQuestion save(CourseQuestion entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseQuestion update(CourseQuestion entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseQuestion entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseQuestion findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseQuestion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
