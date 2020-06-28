package com.onlinelearning.web.mvc.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.service.Service;

@RestController
@RequestMapping(path = "/api/v1")
public abstract class AbstractController<T> {

	protected Service<T> service;
	
	@Autowired
	public AbstractController(Service<T> service) {
		this.service = service;
	}
	
	
}
