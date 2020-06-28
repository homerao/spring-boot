package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.Course;
import com.onlinelearning.web.mvc.service.Service;

public class CourseController extends AbstractController<Course> {

	public CourseController(Service<Course> service) {
		super(service);
		
	}

}
