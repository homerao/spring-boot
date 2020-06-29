package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.CourseExamAlternative;
import com.onlinelearning.web.mvc.repository.CourseExamAlternativeRepository;
@Component
@org.springframework.stereotype.Service
public class CourseExamAlternativeService implements Service<CourseExamAlternative> {

	private final CourseExamAlternativeRepository repository;
	@Autowired
	public CourseExamAlternativeService(CourseExamAlternativeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseExamAlternative save(CourseExamAlternative entitydto) {
		
		return null;
	}

	@Override
	public CourseExamAlternative update(CourseExamAlternative entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseExamAlternative entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseExamAlternative findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseExamAlternative> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
