package com.onlinelearning.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlinelearning.web.mvc.model.CourseCertificate;
import com.onlinelearning.web.mvc.repository.CourseCertificateRepository;
@Component
@org.springframework.stereotype.Service
public class CourseCertificateService implements Service<CourseCertificate> {

	private final CourseCertificateRepository repository;
	@Autowired
	public CourseCertificateService(CourseCertificateRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public CourseCertificate save(CourseCertificate entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseCertificate update(CourseCertificate entitydto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CourseCertificate entitydto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseCertificate findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseCertificate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
