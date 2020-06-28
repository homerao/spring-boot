package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseRegistration;
import com.onlinelearning.web.mvc.service.Service;

public class CourseRegistrationController extends AbstractController<CourseRegistration> {

	public CourseRegistrationController(Service<CourseRegistration> service) {
		super(service);
		
	}

}
