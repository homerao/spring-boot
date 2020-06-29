package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Course;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/courses")
@CrossOrigin(origins = "*")
public class CourseController extends AbstractController<Course> {

	public CourseController(Service<Course> service) {
		super(service);
		
	}

}
