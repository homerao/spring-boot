package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Email;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/useraddress")
public class EmailController extends AbstractController<Email> {

	public EmailController(Service<Email> service) {
		super(service);
		
	}

}
