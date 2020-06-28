package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseText;
import com.onlinelearning.web.mvc.service.Service;

public class CourseTextController extends AbstractController<CourseText> {

	public CourseTextController(Service<CourseText> service) {
		super(service);
		
	}

}
