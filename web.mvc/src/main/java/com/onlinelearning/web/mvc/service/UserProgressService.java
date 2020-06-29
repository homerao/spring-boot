package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.UserProgress;
import com.onlinelearning.web.mvc.repository.UserProgressRepository;
@Component
@org.springframework.stereotype.Service
public class UserProgressService implements Service<UserProgress> {

	private final UserProgressRepository repository;
	@Autowired
	public UserProgressService(UserProgressRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public UserProgress save(UserProgress entitydto) {
		
		return null;
	}

	@Override
	public UserProgress update(UserProgress entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserProgress entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserProgress findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserProgress> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
