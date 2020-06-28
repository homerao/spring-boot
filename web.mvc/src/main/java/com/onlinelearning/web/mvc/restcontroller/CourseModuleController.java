package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseModule;
import com.onlinelearning.web.mvc.service.Service;

public class CourseModuleController extends AbstractController<CourseModule> {

	public CourseModuleController(Service<CourseModule> service) {
		super(service);
		
	}

}
