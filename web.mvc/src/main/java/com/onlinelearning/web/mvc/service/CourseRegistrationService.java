package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.CourseRegistration;
import com.onlinelearning.web.mvc.repository.CourseRegistrationRepository;
@Component
@org.springframework.stereotype.Service
public class CourseRegistrationService implements Service<CourseRegistration> {

	private final CourseRegistrationRepository repository;
	@Autowired
	public CourseRegistrationService(CourseRegistrationRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseRegistration save(CourseRegistration entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseRegistration update(CourseRegistration entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseRegistration entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseRegistration findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseRegistration> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
