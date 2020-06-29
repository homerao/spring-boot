package com.onlinelearning.web.mvc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlinelearning.web.mvc.model.Account;
import com.onlinelearning.web.mvc.repository.AccountRepository;

@Component
@Service
public class AccountService implements com.onlinelearning.web.mvc.service.Service<Account>{
	
	
	private final AccountRepository repository;
	@Autowired
	public AccountService(AccountRepository repository) {
		
		this.repository = repository;
	}
	



	@Override
	public Account save(Account entitydto) {
		
		return repository.save(entitydto);
	}

	@Override
	public Account update(Account entitydto) {
		
		return repository.save(entitydto);
	}

	@Override
	public void delete(Account entitydto) {
		
		repository.delete(entitydto);
	}

	@Override
	public Account findOne(Long id) {
		
		return repository.getOne(id);
	}

	@Override
	public List<Account> findAll() {
		
		return  repository.findAll();
	}
	
	public Account findByEmail(String email) {
		return repository.findByEmail(email);
	}

	


}
