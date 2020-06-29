package com.onlinelearning.web.mvc.service;

import java.util.List;

import com.onlinelearning.web.mvc.model.ApiAccess;
import com.onlinelearning.web.mvc.repository.ApiAccessRepository;

public class ApiAccessService implements Service<ApiAccess> {

	private final ApiAccessRepository repository;
	
	public ApiAccessService(ApiAccessRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public ApiAccess save(ApiAccess entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiAccess update(ApiAccess entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(ApiAccess entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ApiAccess findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApiAccess> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
