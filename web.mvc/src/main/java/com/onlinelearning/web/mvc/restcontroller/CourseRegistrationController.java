package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseRegistration;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/registrations")
@CrossOrigin(origins = "*")
public class CourseRegistrationController extends AbstractController<CourseRegistration> {

	public CourseRegistrationController(Service<CourseRegistration> service) {
		super(service);
		
	}

}
