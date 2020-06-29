package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.AccountRecovery;
import com.onlinelearning.web.mvc.repository.AccountRepository;
@Component
@org.springframework.stereotype.Service
public class AccountRecoveryService implements Service<AccountRecovery> {

	private final AccountRepository repository;
	@Autowired
	public AccountRecoveryService(AccountRepository rep) {
		this.repository = rep;
	}
	@Override
	public AccountRecovery save(AccountRecovery entitydto) {
		
		return null;
	}

	@Override
	public AccountRecovery update(AccountRecovery entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(AccountRecovery entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountRecovery findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountRecovery> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
