package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.Email;
import com.onlinelearning.web.mvc.service.Service;

public class EmailController extends AbstractController<Email> {

	public EmailController(Service<Email> service) {
		super(service);
		
	}

}
