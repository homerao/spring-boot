package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.UserLocation;
import com.onlinelearning.web.mvc.repository.UserLocationRepository;
@Component
@org.springframework.stereotype.Service
public class UserLocationService implements Service<UserLocation> {

	private final UserLocationRepository repository;
	@Autowired
	public UserLocationService(UserLocationRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public UserLocation save(UserLocation entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserLocation update(UserLocation entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserLocation entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserLocation findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserLocation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
