package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Course;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class CourseController extends AbstractController<Course> {

	public CourseController(Service<Course> service) {
		super(service);
		
	}

}
