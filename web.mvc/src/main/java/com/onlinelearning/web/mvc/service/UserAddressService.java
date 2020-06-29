package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinelearning.web.mvc.model.UserAddress;
import com.onlinelearning.web.mvc.repository.UserAddressRepository;

public class UserAddressService implements Service<UserAddress> {

	private final UserAddressRepository repository;
	@Autowired
	public UserAddressService(UserAddressRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public UserAddress save(UserAddress entitydto) {
		
		return null;
	}

	@Override
	public UserAddress update(UserAddress entitydto) {
		
		return null;
	}

	@Override
	public void delete(UserAddress entitydto) {
	
		
	}

	@Override
	public UserAddress findOne(Long id) {
		
		return null;
	}

	@Override
	public List<UserAddress> findAll() {
		
		return null;
	}

}
