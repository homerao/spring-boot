package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.Payment;
import com.onlinelearning.web.mvc.repository.PaymentRepository;
@Component
@org.springframework.stereotype.Service
public class PaymentService implements Service<Payment> {

	private final PaymentRepository repository;
	@Autowired
	public PaymentService(PaymentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Payment save(Payment entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment update(Payment entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Payment entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
