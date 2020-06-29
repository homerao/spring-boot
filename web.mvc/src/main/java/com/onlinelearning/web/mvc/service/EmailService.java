package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinelearning.web.mvc.model.Email;
import com.onlinelearning.web.mvc.repository.EmailRepository;

public class EmailService implements Service<Email> {

	private final EmailRepository repository;
	
	@Autowired
	public EmailService(EmailRepository emailRepository) {
		this.repository = emailRepository;
	}
	@Override
	public Email save(Email entitydto) {
		// TODO Auto-generated method stub
		return repository.save(entitydto);
	}

	@Override
	public Email update(Email entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Email entitydto) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public Email findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Email> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
