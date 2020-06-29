package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Email;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class EmailController extends AbstractController<Email> {

	public EmailController(Service<Email> service) {
		super(service);
		
	}

}
